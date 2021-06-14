package com.gabrielvillarreal;

import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Question 1a
		System.out.println("Question 1a");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		subtract(ages);
		
// Question 1b
		System.out.println("Question 1b");
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93,1000};
		subtract(newAges);
		
// Question 1c
		System.out.println("Question 1c");
		average(ages);
		
// Question 2a		
		System.out.println("Question 2a");
		
		String[] names = new String[]{"Sam","Tim", "Sally", "Buck", "Bob"};
		charCount(names);

// Question 2b		
		System.out.println("Question 2b");		
		concat(names);
		
// Question 3		
		System.out.println("Question 3");	
		System.out.println("You can access the last element of an array by using - array.length() - 1");	

// Question 4
		System.out.println("Question 4");
		System.out.println("You can access the first element of an array by using - array[0]");

// Question 5
		System.out.println("Question 5");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//must have arrays to string to print array content.
		//https://stackoverflow.com/questions/19477869/array-and-java-string-error-ljava-lang-string19c42c4b
		System.out.println(Arrays.toString(nameLengths));

// Question 6
		System.out.println("Question 6");
		int sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println(sum);
			
// Question 7
		System.out.println("Question 7");
//      duplicate string method is listed below
//		public static void duplicateString (String x, int y) {
//			String buffer = "";
//			for (int i = 0; i < y; i++) {
//				buffer = buffer + x;
//			}
//				System.out.println(buffer);
//		}
		duplicateString("Henrythecat", 3);
		
// Question 8
		System.out.println("Question 8");
//		method for full name concat
//		public static void fullName (String x, String y) {
//			String fullName;
//			System.out.println(fullName = x + " " + y);	
		fullName("Gabriel", "Alexander");

// Question 9
		System.out.println("Question 9");
//		int sum = 0;
//		for (int i = 0; i < nameLengths.length; i++) {
//			sum += nameLengths[i];
//		}
//		System.out.println(sum);
		ifGreater100(ages);

// Question 10
		System.out.println("Question 10");
//		public static void avDoubles (double x []) {
//			double total = 0;
//			for (double i = 0.0; i < x.length; i++)
//				total = total + x[(int) i];
//				double average = total/ x.length;
//				System.out.println(average);
		double [] dubs = new double [] {3.5, 6.9, 2.0, 8.9, 7.1};
		double [] randomDub = new double [] {2.2, 7.7, 1.9, 9.0, 3.4}; 
		avDoubles(dubs);
//Question 11
		System.out.println("Question 11");
//		public static void avDoublestimes2 (double x [], double y []) {
//			double total = 0;
//			double total2 = 0;
//			for (double i = 0.0; i < x.length; i++)
//				total = total + x[(int) i];
//			for (double i = 0.0; i < y.length; i++)
//				total2 = total2 + y[(int) i];
//				double average2 = (total + total2)/ (x.length + y.length);
//				System.out.println(average2);
		avDoublestimes2(dubs, randomDub);
//Question 12
		System.out.println("Question 12");
//		public static void willBuyDrink (int c, double y) {
//			double moneyInPocket = y;
//			boolean isHotOutside = c > 90;
//			if ((isHotOutside) && (moneyInPocket > 10.50)){
//				System.out.println("It is a good day for a cold beverage!");
//			}
//			else {
//				System.out.println("Better to wait for another day and save some money..");
//			}
// ** temperature is the first variable and second variable is money in pocket. 
		willBuyDrink(100, 11.0);
		willBuyDrink(80, 11.0);
		willBuyDrink(101, 7.0);

//Question 13
		System.out.println("Question 13");		
// I made a method to keep track of the days of the week
// in order to stay motivated and also to help me have a better sense of time
// throughout the week and to give myself some goals. To use the method you
// must list a day of the week 1-7		
	schedule(5);
	schedule(3);
	schedule(7);
	schedule(10);
		
	}
// method for subtracting numbers
public static void subtract (int x []) {
	int a = x [0];
	int b = x [x.length - 1];
	int subtract = a - b;
	System.out.println(subtract);
	}

// method for finding average
public static void average (int x []) {
	int total = 0;
	for (int i = 0; i < x.length; i++)
		total = total + x[i];
		int average = total/ x.length;
		System.out.println(average);
	}

//method for counting characters in a string and adding them together
public static void charCount (String x []) {
	int sum = 0;
	int average = 0;
	for (int i = 0; i < x.length; i++) {
		sum += x[i].length();
	}
	average = sum / x.length;
	System.out.println(average);
	}
	
// method for concatenating strings from an array together
public static void concat (String x []) {
		String concat = "";
		for (int i = 0; i < x.length; i++) {
			concat += x[i] + "";
		}
		System.out.println(concat);
	}
// method for printing string n times
	public static void duplicateString (String x, int y) {
		String buffer = "";
		for (int i = 0; i < y; i++) {
			buffer = buffer + x;
		}
			System.out.println(buffer);
	}
// method for name concatenation
	public static void fullName (String x, String y) {
		System.out.println(x + " " + y);	
	}
// method for checking if the sum of 
// an array of ints is greater than 100
	public static void ifGreater100 (int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum > 100);
	}
// method for average of doubles
	public static void avDoubles (double x []) {
		double total = 0;
		for (double i = 0.0; i < x.length; i++)
			total = total + x[(int) i];
			double average = total/ x.length;
			System.out.println(average);
	}
// method for average of two arrays of doubles
		public static void avDoublestimes2 (double x [], double y []) {
			double total = 0;
			double total2 = 0;
			for (double i = 0.0; i < x.length; i++)
				total = total + x[(int) i];
			for (double i = 0.0; i < y.length; i++)
				total2 = total2 + y[(int) i];
				double average2 = (total + total2)/ (x.length + y.length);
				System.out.println(average2);
		}
// method for checking if it is hot outside vs. money in pocket.
		public static void willBuyDrink (int c, double y) {
			double moneyInPocket = y;
			boolean isHotOutside = c > 90;
			if ((isHotOutside) && (moneyInPocket > 10.50)){
				System.out.println("It is a good day for a cold beverage!");
			}
			else {
				System.out.println("Better to wait for another day and save some money..");
			}
		}
				
// method for checking the week to see when is class. 
		public static void schedule (int x) {
		int weekDay = x;
		if ((x < 0) || (x > 7)) {
			System.out.println("This is not a day of the week.");
		}
			switch (weekDay) {
		case 1:
			System.out.println("2 more days to Wednesday. Need to keep studying.");
			break;
		case 2:
			System.out.println("1 more day to class. Need to double check my assignments and try to stay on top of things.");
			break;
		case 3:
			System.out.println("Class starts at 7:00pm. Hope to see everyone soon!");
			break;
		case 4:
			System.out.println("6 more days until the next class. Don't get distracted and review the course videos to reinforce the lecture.");
			break;
		case 5:
			System.out.println("5 more days until class. Hope we don't have to do any overtime today and that we are close to being finished with the assignments.");
			break;
		case 6:
			System.out.println("4 more days until class. Finish all the assignments early!");
			break;
		case 7:
			System.out.println("3 more days until class. Continue to stay ahead and get ready for Monday!");
			break;
		}
	}

}




			


	

