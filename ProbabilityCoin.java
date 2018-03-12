package org.company.BridgeLabz;

import java.util.Scanner;

public class ProbabilityCoin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of coins :- ");
		int n = sc.nextInt();
		sc.close();
		double tolPoss = Math.pow(2, n);
		System.out.println(tolPoss);
		double tolHead = tolPoss-1;
		
		double poss = (tolHead/tolPoss) * 100;
		
		System.out.println("Percentage of getting head is " + poss);
	}

}
