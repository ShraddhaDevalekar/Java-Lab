package com.cg.labs.lab1;
	
import java.util.Scanner;

	/*Write a Java program that prompts the user for an integer and
	  then prints out all the prime numbers up to that Integer?
	*/
	public class Lab1Exp4
	  {
	   public static void main(String[] args)
	   {
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter a start number :");
	    int n1 = s.nextInt();
	    
	    System.out.println("Enter a end number :");
	    int n2 = s.nextInt();
	   
	    for(int i=n1; i<= n2;i++)
	    {
	    	int j;
	    	for(j=2 ; j<i;j++)
	    	{  
	    		if(i%j==0)
	    		{
	    			break;
	    		}
	    	}
		      if(j==i)
		        {
		    	  System.out.println(i);
		        }
		    }
	   
		s.close();
	   }
	 }
	  

