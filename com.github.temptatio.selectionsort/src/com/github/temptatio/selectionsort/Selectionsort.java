package com.github.temptatio.selectionsort;

/**
 * Diese Klasse implementiert Selection-Sort zum Sortieren eines Arrays 
 *
 */
public class Selectionsort {

	/**
	 * Diese Methode sortiert ein doubel-Array
	 * 
	 * @param array Das zu sortierende Array
	 */
	public static void sort(double[] array) {
		
		final int laenge = array.length;
		
		for(int i = 0; i < laenge; ++i) {
			double min = array[i];
			int index = i;
			for(int j = i; j < laenge; ++j) {
				if(array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = min;
		}
		
	}
	
}
