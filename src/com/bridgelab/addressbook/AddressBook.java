package com.bridgelab.addressbook;

import java.util.Scanner;

public class AddressBook {
	Contact contacts;	
	public void add() {
		System.out.println("Enter following details.....");
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Last Name : ");
		String lastName = sc.nextLine();
		System.out.println("Address : ");
		String address = sc.nextLine();
		System.out.println("City : ");
		String city = sc.nextLine();
		System.out.println("State : ");
		String state = sc.nextLine();
		System.out.println("Zip Code : ");
		int zipCode = sc.nextInt();
		System.out.println("Mobile Number : ");
		String mobileNumber = sc.next();
		System.out.println("Email Id: ");
		String email = sc.next();
		contacts = new Contact(firstName, lastName, address, state, city, zipCode, mobileNumber, email);
		System.out.println("You have added a contact :) ");
		sc.close();
	}
	@Override
	public String toString() {
		return contacts.toString() ;
	}
	


}
