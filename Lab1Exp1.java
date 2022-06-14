
package com.cg.labs.lab1;

import java.util.Scanner;

public class Lab1Exp1 {
	public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter a number ");
      int num=sc.nextInt();
          int ans =cube(num);
     
          
          int output = cube(num);
    System.out.println(output);
    
    System.out.println(ans);
   
   }
    public static int cube(int num)
    {   int solution=1;
         for(int i=num;i>=0;i=i/10) 
         {   int rem=i%10;
            solution=solution+(rem*rem*rem);
         }
         return solution;
    }
}

