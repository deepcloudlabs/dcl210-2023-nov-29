package com.example.world.repository.orm;

import static java.util.Optional.ofNullable;

import java.util.Collection;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.world.entity.Country;
import com.example.world.repository.CountryRepository;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
@Repository
public class JpaCountryRepository implements CountryRepository {
	@PersistenceContext
	private EntityManager entityManager;

	public Optional<Country> findOne(String code) {
		return ofNullable(entityManager.find(Country.class, code));
	}

	public Collection<Country> findAll() {
		return entityManager.createNamedQuery("Country.findAll", Country.class).getResultList();
	}

	@Transactional
	public Country add(Country country) {
		String code = country.getKod();
		Optional<Country> found = findOne(code);
		if (found.isPresent())
			throw new IllegalArgumentException("Country exists!");
		entityManager.persist(country);
		return country;
	}

	@Transactional
	public Country update(Country country) {
		String code = country.getKod();
		Optional<Country> found = findOne(code);
		if (found.isPresent()) {
			Country c = found.get();
			c.setPopulation(country.getPopulation());
			c.setSurface(country.getSurface());
			entityManager.merge(c);
			return c;
		}
		throw new IllegalArgumentException("Country does not exist!");
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Optional<Country> remove(String key) {
		return Optional.empty();
	}

	public Collection<Country> getByContinent(String continent) {
		return entityManager.createNamedQuery("Country.findByContinent", Country.class)
				 .setParameter("continent", continent)
				 .getResultList();
	}

	@SuppressWarnings("unchecked")
	public Collection<String> getContinents() {
		return entityManager.createNativeQuery("select distinct continent from country").getResultList();
	}

}
