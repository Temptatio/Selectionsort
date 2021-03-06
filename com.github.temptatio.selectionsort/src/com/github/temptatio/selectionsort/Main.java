package com.github.temptatio.selectionsort;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;

public class Main {
	
	final static int LAENGE = 10;

	public static void main(String[] args) {
		double[] array = erstelleZufallsarray();
		
		System.out.println("Nicht sortiert:\n");
		System.out.println("=====================================\n");
		druckeArray(array);
		
		Selectionsort.sort(array);
		
		System.out.println("Sortiert:\n");
		System.out.println("=====================================\n");
		druckeArray(array);
		
	}
	
	private static void druckeArray(final double[] array) {
		for(int i = 0; i < array.length; ++i) {
			System.out.printf(Locale.US, "%.4f\n", array[i]);
		}
	}
	
	private static double[] erstelleZufallsarray() {
		SecureRandom secureRandom = new SecureRandom();
		long seed = new BigInteger(secureRandom.generateSeed(Integer.SIZE/Byte.SIZE)).longValue();
		Random random = new Random(seed);
		
		double[] array = new double[LAENGE];
		
		for(int i = 0; i < LAENGE; ++i) {
			array[i] = random.nextDouble();
		}
		
		return array;
	}
	
}
