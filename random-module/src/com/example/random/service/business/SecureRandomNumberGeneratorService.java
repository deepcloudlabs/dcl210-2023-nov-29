package com.example.random.service.business;

import java.security.SecureRandom;

import com.example.random.service.Qualities;
import com.example.random.service.Quality;
import com.example.random.service.QualityLevel;
import com.example.random.service.RandomNumberGeneratorService;

@Qualities({
	@Quality(QualityLevel.SECURE),
	@Quality(QualityLevel.FAST)
})
public class SecureRandomNumberGeneratorService implements RandomNumberGeneratorService {

	private SecureRandom random = new SecureRandom();

	@Override
	public int generate(int min, int max) {
		return random.nextInt(min, max);
	}

}
