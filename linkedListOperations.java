package com.java.linkedlist;

public class linkedListOperations {

	public static void main (String args[])

	{
		linkedListOperations llo = new linkedListOperations();
		llo.addLinkedList();
		llo.printTrianlge();
		
	}
	public void addLinkedList()
	{
		System.out.println("This is a Java Class");
	}
	public void printTrianlge()
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=i;j<=5;j++)
				System.out.print(j + " ");
			System.out.println();
			for (int s=1;s<=i*2;s++)
				System.out.print(" ");
		}
	
	}
}


