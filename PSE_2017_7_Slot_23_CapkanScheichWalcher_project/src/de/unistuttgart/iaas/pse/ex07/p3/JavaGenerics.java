package de.unistuttgart.iaas.pse.ex07.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides simple sorting capabilities using generics.
 */
public class JavaGenerics {

	/**
	 * Sorts a list in ascending order.
	 * 
	 * @param list
	 *            some list
	 * @return elements of input list, sorted in ascending order
	 */
	public static <T extends Comparable<T>> List<T> sort(List<T> list) {
		// TODO Übungsblatt 7, Aufgabe 3a
		return null;
	}

	public static void main(String[] args) {
		// a simple test
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(3);
		list.add(0);
		list.add(12);
		ArrayList<Integer> sortedList = (ArrayList<Integer>) sort(list);
		for (Integer integer : sortedList) {
			System.out.print(integer + ", ");
		}
	}

}
