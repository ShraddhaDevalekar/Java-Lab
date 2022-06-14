package com.cg.labs.lab1;

public class Lab1Exp7 {
	public boolean checkNumber (int input)
	{
	    // Deal with negative inputs...
	    if (input < 0)
	        input = -input;

	    int lastSeen = 10; // always greater than any digit
	    int current;

	    while (input > 0) {
	        current = input % 10;
	        if (lastSeen < current)
	            return false;
	        lastSeen = current;
	        input /= 10;
	    }
	    return true;
	}
}
