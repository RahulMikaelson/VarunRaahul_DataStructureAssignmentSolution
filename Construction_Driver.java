package com.greatlearning.Graded_Assessment.Projects3.Question1;

import java.util.LinkedList;
import java.util.Scanner;

public class Construction_Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConstructionOrder oc = new ConstructionOrder();

		//  Original linked list to store size of the floor
		LinkedList<Integer> original = new LinkedList<>();
		System.out.println("Enter the total number of floors in building");
		int num = sc.nextInt();
		// Adding floor size to original linked list.
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1));
			original.add(sc.nextInt());
		}
		oc.orderConstruction(original);
		sc.close();
	}

}
