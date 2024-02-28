package com.darshan.linecomp;

import java.util.Scanner;

public class LineCompProblem {

	public static void main(String[] args) {

		int x1;
		int y1;
		int x2;
		int y2;
		double length;
		
		System.out.println("Welcome to Line Comparison Computation Program");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the x1 y1 and x2 y2 Point for the Line :");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2)); 
		
		System.out.println("Length of Line :" + length);
	}

}
