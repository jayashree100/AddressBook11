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
	
	 void editContact()
		{	if( contactlist.size()>0) {
			String newFirstName;
			System.out.println("Enter First name of contact to edit it ");
			newFirstName = sc.next();
			for (int i = 0; i < contactlist.size(); i++) 
			{
				if (contactlist.get(i).getFirstName().equals(newFirstName))
				{
					System.out.println("Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
					int input = sc.nextInt();
					switch (input)
					{
					case 1:
						System.out.println("Enter new first name");
						contactlist.get(i).setFirstName(sc.next());
						break;
					case 2:
						System.out.println("Enter new last name");
						contactlist.get(i).setLastName(sc.next());
						break;
					case 3:
						System.out.println("Enter new Address");
						contactlist.get(i).setAddress(sc.next());
						break;
					case 4:
						System.out.println("Enter new city");
						contactlist.get(i).setCity(sc.next());
						break;
					case 5:
						System.out.println("Enter new state");
						contactlist.get(i).setState(sc.next());
						break;
					case 6:
						System.out.println("Enter new zip");
						contactlist.get(i).setZipCode(sc.nextInt());
						break;
					case 7:
						System.out.println("Enter new phone number");
						contactlist.get(i).setMobileNumber(sc.next());
						break;
					case 8:
						System.out.println("Enter new email");
						contactlist.get(i).setEmailId(sc.next());
						break;
					default:
						System.out.println("Invalid Entry");
					}     
					System.out.println("Contact Edited Successfully");
				} else 
					System.out.println("Contact doesn't exist");
			}
		}else System.out.println("There are no contacts as of now.....");
		}

		
	


}
