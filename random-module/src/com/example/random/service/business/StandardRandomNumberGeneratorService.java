package com.example.random.service.business;

import java.util.concurrent.ThreadLocalRandom;

import com.example.random.service.Quality;
import com.example.random.service.QualityLevel;
import com.example.random.service.RandomNumberGeneratorService;


@Quality(QualityLevel.FAST)
public class StandardRandomNumberGeneratorService implements RandomNumberGeneratorService {

	@Override
	public int generate(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

}
