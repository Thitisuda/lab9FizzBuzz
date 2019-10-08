package lab9;

import java.util.Scanner;

public class Main {
	private static Scanner keyboard;
	public static void main(String[] args) {
		int input;
		keyboard = new Scanner(System.in);
		System.out.print("Enter Integer 1-100 : ");
		input = keyboard.nextInt();
		String output = getInt(input);
			
	}
	
	public static String getInt(int keyboard) {
		if ((keyboard%3)==0) {
			return Fizz();	
		}
		
		
		return Integer.toString(keyboard);		
	}
	
	
	
	public static String Fizz() {
		return "Fizz";
	}

}