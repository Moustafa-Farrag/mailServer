package eg.edu.alexu.csd.datastructure.mailServer.cs20_cs50_cs63;

import eg.edu.alexu.csd.datastructure.mailServer.IContact;

public class Contact implements IContact {

	private String firstName;
	private String lastName;
	private String username;
	private String password;


	public void setFirstName(String name) {
		firstName = name;
	}
	public void setLastName(String name) {
		lastName = name;
	}
	public void setUsername(String name) {
		username = name;
	}
	public void setPassword(String pass) {
		password = pass;
	}


	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean search() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

}
