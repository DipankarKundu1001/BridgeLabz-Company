package org.company.BridgeLabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CouponNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,a,b;
		System.out.println("Enter the Number of Coupon you want :- ");
		n = sc.nextInt();
		System.out.println("Enter the starting Range :- ");
		a = sc.nextInt();
		System.out.println("Enter the ending Range :- ");
		b = sc.nextInt();
		sc.close();
				
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		for(int i=a;i<=b;i++){
			numbers.add(new Integer(i));
		}	
		Collections.shuffle(numbers);
		for(int i=0;i<n;i++){
			System.out.println(numbers.get(i));
		}
	}

}
