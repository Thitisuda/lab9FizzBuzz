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
		return Integer.toString(keyboard);		
	}

}