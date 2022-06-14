package com.cg.labs.lab2;

	//Java Program to sort an array in alphabetical order.
	import java.util.Arrays;  
	import java.util.Scanner;

	public class Lab2Exp2
	{  
	 public static void main(String args[])   
	 {  
	    Scanner sc=new Scanner(System.in);
	    Scanner sc1=new Scanner(System.in);

	    int n;    //Declare array size
	    System.out.println("Enter the number of elements ");
	    n=sc.nextInt();     //Initialize array size

	    String str[]=new String[n];   //Declare array
	    System.out.println("Enter the String ");
	    for(int i=0; i<n ;i++)     //Initialize array
	    {
	        str[i]=sc1.nextLine();
	    }

	    Arrays.sort(str);    //Sort the array in alphabetical order

	    System.out.println(Arrays.toString(str));  //Display the array
	 }  
	}  


