package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.modal.Employee;

public class CredentialService implements ICredentials{

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName+lastName+"@"+department+"gl.com";
	}
	

//	public static void main(String[] args)
//	{
//		CredentialService c = new CredentialService();
//		c.generatePassword();
//	}
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String password="";
	  String capitalLetters="ABCDEFGHIJKLMNOPQURSTUVWXYZ";
	  String smallLetters="abcdefghijklmnopqurstuvwxyz";
	  String numbers = "0123456789";
	  String specialCharacters = "!@#$%^&*_+-/.?<>)";
	  String values= capitalLetters + smallLetters + numbers + specialCharacters;
	  Random random = new Random();
	 // char temp;
	  for(int i = 0; i<8; i++)
	  {
		 int index = random.nextInt(values.length());
		// System.out.println("index:"+index);
		 char c = values.charAt(index);
		// System.out.println("picked up character: "+c);
		 password+=String.valueOf(c);
	//	 System.out.println("password:"+password);
	  }
	  return password;
	}

	@Override
	public void showCredentials(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("");
		System.out.println("Hi"+emp.getFirstName()+""+emp.getLastName()+". Following are the credentials: ");
		System.out.println("Email is: "+emp.getEmail());
		System.out.println("Password is: "+emp.getPassword());
	}

}
