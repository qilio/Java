package backend;

import java.util.Hashtable;

public class AddressBook {
	Hashtable<String, String> address_book = new Hashtable<String, String>();
	
	public AddressBook()
	{
	}
	
	public void insert(String name)
	{
		address_book.put(name, "");
	}
	
	public void insert(String name, String address)
	{
		address_book.put(name, address);
	}
	
	public String find_address(String name)
	{
		return address_book.get(name);
	}
	
	public void remove(String name)
	{
		address_book.remove(name);
	}
}
