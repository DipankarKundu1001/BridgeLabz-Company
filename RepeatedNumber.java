package org.company.BridgeLabz;

import java.util.Scanner;

public class RepeatedNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of array :- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the " + (i+1) + " element :- ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++)
		{
			int temp = arr[i];
			if(i == 0)
				arr1[count++] = temp;
			else
			{
				if(comp(temp,arr1,count))
				{
					arr1[count++] = temp;
				}
			}
		}
		
		for(int i =0 ; i < count; i++)
			System.out.println(arr1[i]);
	}
	
	public static boolean comp(int temp, int[] arr1, int count)
	{
		for(int i = 0; i < count; i++)
		{
			if(temp == arr1[i])
				return false;
		}
		return true;
	}

}
