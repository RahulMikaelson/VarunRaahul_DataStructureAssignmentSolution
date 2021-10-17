package com.greatlearning.Graded_Assessment.Projects3.Question1;

import java.util.Collections;
import java.util.LinkedList;

public class ConstructionOrder {
	//Creating new Temporary linked list to copy all elements from Original linked list
		LinkedList<Integer> List = new LinkedList<>();

		public void orderConstruction(LinkedList<Integer> original) {
			for (int i = 0; i < original.size(); i++) {
				List.add(original.get(i));// adding elements to Temporary List
			}
			// Arranging all elements of List  in decreasing order.
			Collections.sort(List, Collections.reverseOrder());
			int j = 0;
			// Comparing floor size of each day with Original List
			for (int i = 0; i < original.size(); i++) {
				if (original.get(i) != List.get(j))
					System.out.println("Day: " + (i + 1));
				else if (original.get(i) == List.get(j)) {
					System.out.print("Day: " + (i + 1) + " ---> " + List.get(j) + ", ");
					j++;
					try {
						for (int k = 0; k < i; k++) {
							if (original.get(k) == List.get(j)) {
								System.out.print(List.get(j) + ", ");
								j++;
								k = -1;
							}
						}
					}
					catch(IndexOutOfBoundsException e) {
						
					}
					System.out.println();
				}
				System.out.println();
			}
		}
}
