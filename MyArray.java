package com;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {

		int[] inputArray = new int[] {2,3,4,6,7};

		System.out.println("Enter element to be removed from Array");
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int[] outputArray = removeReqElement(inputArray, input);

		if (outputArray == null)
		{
			System.out.println("Your Input does not belong to the Given Array");
		}

		else
		{

			for (int i=0; i<outputArray.length; i++)
			{
				System.out.println("Updated Array is " + outputArray[i]);
			}
		}
	}

	private static int[] removeReqElement(int[] inputArray, int input) {

		int indexToDelete = -1;
		int[] outputArray = new int[inputArray.length - 1];

		for (int i=0; i<inputArray.length; i++)
		{
			if (inputArray[i] == input)
			{
				indexToDelete = i;
				break;
			}
		}

		if (indexToDelete > -1)
		{
			for (int i=0, j=0 ; i<inputArray.length; i++)
			{
				if (i != indexToDelete)
				{
					outputArray[j] = inputArray[i];
					j = j + 1 ; 
				}
			}
		}

		else
		{
			return null;
		}


		return  outputArray;

	}



}
