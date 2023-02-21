package com.bridgelab.addressbook;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("welcome to AddressBook");
		AddressBook book = new AddressBook();
		book.add();
		book.editContact();
		System.out.println(book.toString());
	}

}
