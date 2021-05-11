package gamestoredemo.entities;

import java.time.LocalDate;

public class Gamer extends User {
	
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Gamer() {
		
	}

	public Gamer(int id, String email, String password, 
			String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super(id, email, password);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDateOfBirth(dateOfBirth);
		this.setNationalityId(nationalityId);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
