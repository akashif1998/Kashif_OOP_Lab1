package com.greatlearning.interfaces;

import com.greatlearning.modal.Employee;

public interface ICredentials {
	public String generateEmailAddress(String firstName, String lastName, String department);
	public String generatePassword();
	public void showCredentials(Employee emp);

}
