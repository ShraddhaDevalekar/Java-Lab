package com.cg.labs.lab1;

import java.util.Scanner;

public class Lab1Exp2 {
    //  Write a java program that simulates a traffic light.
//The program lets the user select one of three lights: red, yellow, or green with radio buttons.
//On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in
//the console .Initially there is no message shown.
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
       System.out.println("Please select radio buttons  \n 1 red \n 2 yellow \n 3 green");

         int colour = sc.nextInt();
    switch(colour)
  {
    case 1:
    System.out.println("Stop vehicle !");
     break;
    case 2 :
    System.out.println("Get Ready to Go !");
    break;
    case 3:
    System.out.println("Go!!!!");
     break;
    default:
    System.out.println("invalid");
  break;
  }

  }

 }



