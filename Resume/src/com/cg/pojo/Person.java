package com.cg.pojo;

import java.util.Arrays;

public class Person {

	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public String getQualification() {
		return qualification;
	}

	public String getDob() {
		return dob;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public String[] getSkills() {
		return skills;
	}

	public String getEmail() {
		return email;
	}

	public String getWebsite() {
		return website;
	}

	public String getContact() {
		return contact;
	}

	public String getBio() {
		return bio;
	}
	
	private String firstName;
	private String lastName;
	private String gender;
	private String qualification;
	private String dob;
	private String[] hobbies;
	private String[] skills;
	private String email;
	private String website;
	private String contact;
	private String bio;
	
	public Person(String firstName, String lastName, String gender, String qualification, String dob, String[] hobbies,
			String[] skills, String email, String website, String contact, String bio) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.qualification = qualification;
		this.dob = dob;
		this.hobbies = hobbies;
		this.skills = skills;
		this.email = email;
		this.website = website;
		this.contact = contact;
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", qualification="
				+ qualification + ", dob=" + dob + ", hobbies=" + Arrays.toString(hobbies) + ", skills="
				+ Arrays.toString(skills) + ", email=" + email + ", website=" + website + ", contact=" + contact
				+ ", bio=" + bio + "]";
	}
	
	
}
