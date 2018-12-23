package com.example.bean;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @NotBlank：只能作用在String上，不能为null，而且调用trim()后，长度必须大于0 ("test")
 * @NotEmpty：不能为null，而且长度必须大于0
 * @NotNull：不能为null，但可以为""
 */

public class Employee {

	@NotNull
	private Integer id;

	@NotBlank
	private String lastName;

	private String email;
	// 1 male, 0 female
	private Integer gender;
	private Department department;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:ss")
	private Date birth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", gender="
				+ gender + ", department=" + department + ", birth=" + birth + '}';
	}

}
