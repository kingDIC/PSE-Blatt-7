package de.unistuttgart.iaas.pse.ex07.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides simple sorting capabilities using generics.
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
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
		ArrayList<T> liste = new ArrayList<T>();
		for(int i = 0; i < list.size(); i++) {
			if(liste.size() == 0) {
				liste.add(0, list.get(i));
			} else {
				int j = liste.size() - 1;
				while(j >= 0 && liste.get(j).compareTo(list.get(i)) > 0) {
					j--;
				}
				if(j < -1) {
					j = 0;
				}
				liste.add(j + 1, list.get(i));
			}
		}
		return liste;
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
