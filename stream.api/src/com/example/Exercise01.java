package com.example;

import java.util.function.Function;

import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

public class Exercise01 {
	// -XX:+UnlockDiagnosticVMOptions -XX:+PrintFlagsFinal
	// -Djava.util.concurrent.ForkJoinPool.common.parallelism=6
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Stream API (processing) -> Collection API (storage)
		// Paradigms           : Functional Programming + OOP
		// Processing Framework: Filter/Map/Reduce: HoF 
		// Features            : i) Pipeline/Method Chain/Function Composition
		//                          a) HoF (Higher-Order Function)
		//                          b) Pure Function -> Side-effect free/Stateless/No Mutation/Immutable
		//                          Immutability
		//                      ii) Lazy Evaluation -> Terminal Methods
		//                          a. Intermediary Methods
		//                          b. Terminal Methods 
		var countries = InMemoryWorldDao.getInstance().findAllCountries();
		/*
		Function<Country, String> continentMapper = country -> {
			System.out.println("continentMapper is running for %s.".formatted(country.getName()));
			return country.getContinent();
		};
		*/
		Function<Country, String> continentMapper = country -> country.getContinent(); // lambda expression
		Function<Country, String> alternativeContinentMapper = Country::getContinent;  // method reference
		
		var logicalProcessors = Runtime.getRuntime().availableProcessors();
		var parallelism = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
		System.out.println(parallelism);
		
		var continents =
		countries.stream() // creates a new pipeline!
		         .parallel() // parallel pipeline => ForkJoinFramework -> ForkJoinPool -> Job Stealing Algorithm
		         //.peek(System.out::println)
		         .map( alternativeContinentMapper ) // intermediary method: map (Map), HoF
		         //.peek(System.out::println)
		         .distinct()             // intermediary method: distinct ( Filter)
		         //.peek(System.out::println)
		         .sorted()               // intermediary method
		         //.peek(System.out::println)
		         //.collect(Collectors.toList())
		         //.takeWhile(null)
		         //.collect(LinkedList::new,LinkedList::add,LinkedList::addAll); // terminal method   
       		     .toList(); // terminal method   
		// LinkedList::new references to the default constructor of LinkedList
		System.out.println(continents);
	}

}
