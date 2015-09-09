package com.github.temptatio.selectionsort;

/**
 * Diese Klasse implementiert Selection-Sort zum Sortieren eines Arrays 
 *
 */
public class Selectionsort {

	/**
	 * Diese Methode sortiert ein double-Array
	 * 
	 * @param array Das zu sortierende Array
	 */
	public static void sort(double[] array) {
		
		final int laenge = array.length;
		
		for(int i = 0; i < laenge; ++i) {
			int index = i;
			for(int j = i; j < laenge; ++j) {
				if(array[j] < array[index]) {
					index = j;
				}
			}
			double min = array[index];
			array[index] = array[i];
			array[i] = min;
		}
		
	}
	
}
