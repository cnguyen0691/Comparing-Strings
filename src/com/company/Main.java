package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a word: " );
	    String name = scan.nextLine();
	    System.out.println("Enter a number as an index: ");
	    int index = scan.nextInt();

	    if (name.length() < index){
	    	System.out.println("Index is larger than length");
	    	System.exit(0);
		} else

	    System.out.println("The length iof alphabet is: " + name.length());
	    System.out.println("The substring from 0 to 3 is: " + name.substring(0,index+1));
    }
}
