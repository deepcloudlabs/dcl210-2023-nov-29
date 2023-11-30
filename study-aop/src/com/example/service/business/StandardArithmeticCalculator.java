package com.example.service.business;

import com.example.aspect.Audit;
import com.example.aspect.Cache;
import com.example.aspect.Profile;
import com.example.service.ArithmeticCalculator;

@Cache
public class StandardArithmeticCalculator implements ArithmeticCalculator {

	@Override
	public double add(double x, double y) {
		System.out.println("StandardArithmeticCalculator::add");
		return x+y;
	}

	@Override
	@Profile
	public double sub(double x, double y) {
		return x-y;
	}

	@Override
	@Audit
	public double mul(double x, double y) {
		return x*y;
	}

	@Override
	public double div(double x, double y) {
		return x/y;
	}

}
