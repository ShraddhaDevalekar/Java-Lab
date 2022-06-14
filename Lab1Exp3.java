package com.cg.labs.lab1;

import java.util.Scanner;

public class Lab1Exp3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int i, a = 1, b = 1, c = 0;
			System.out.println("Enter the value :- ");
			int input = sc.nextInt();
			for (i = 0; i < input; i++) {
				a = b;
				b = c;
				c = a + b;
				System.out.println(c);
				sc.close();
			}

		}

}
