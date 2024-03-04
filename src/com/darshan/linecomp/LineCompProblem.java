package com.darshan.linecomp;

import java.util.Scanner;

public class LineCompProblem {
	
	int x1;
	int y1;
	int x2;
	int y2;
	double length;

	public void lineInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the x1 y1 and x2 y2 Point for the Line :");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
	}
	
	public double lineCalculate()
	{
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2)); 
	}
	
	public void lineCheck(LineCompProblem linecompproblem2)
	{
		if(this.lineCalculate()== linecompproblem2.lineCalculate())
		{
			System.out.println("Both Line are Same");
		}
		else if(this.lineCalculate() > linecompproblem2.lineCalculate())
		{
			System.out.println("Line 1 is Greater than Line 2");
		}
		else
		{
			System.out.println("Line 2 is Greater than Line 1");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");
		
		LineCompProblem linecompproblem = new LineCompProblem();
		LineCompProblem linecompproblem2 = new LineCompProblem();
		linecompproblem.lineInput();		
		linecompproblem2.lineInput();
		linecompproblem.lineCheck(linecompproblem2);
		}
}
