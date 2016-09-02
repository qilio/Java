package backend;

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		AddressBook address_book = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		while(!input.equals("quit"))
		{
			String name = scanner.next();
			
			if(input.equals("add"))
			{
				String address = scanner.nextLine();
				
				address_book.insert(name, address);
				System.out.println(name + " at" + address + " has been added.");
			}
			else if(input.equals("remove"))
			{
				address_book.remove(name);
				System.out.println(name + " removed.");
			}
			else if(input.equals("find"))
			{
				System.out.println(address_book.find_address(name));
			}
			
			input = scanner.next();
		}	
		
		System.out.println("Dueces xX360NoSc0p3#Blazitfaget");
	}
}
