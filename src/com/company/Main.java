package com.company;

public class Main {

	public static void main(String[] args) {
		//password checking app
		String password = "password";
		String passwordEntered = "not password";
		for (int i = 2; i > -1; i--) {
			if (passwordEntered == password) {
				System.out.println("Correct Password");
				break;
			} else {
				System.out.println("Incorrect Password. " + i + " attempts remaining");
			}
		}
	}
}
