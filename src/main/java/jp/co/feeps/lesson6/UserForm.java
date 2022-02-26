package jp.co.feeps.lesson6;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class UserForm{
	
	@NotBlank
	private String name;
	@NotNull
	@Min(value = 0)
	@Max(value = 100)
	private int age;
	@Past
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;

	public String getName() {
		System.out.println("in getter " + name );
		return name;
	}
	public void setName(String name) {
		System.out.println("in setter " + name);
		this.name = name;
	}

//	aoutomatically called getter and setter :
//	this is called by getName_given_in_html

	public int getAge() {
		System.out.println("in getter " + age );
		return age;
	}
	public void setAge(int age) {
		System.out.println("in setter " + age);
		this.age = age;
	}
	

	public Date getBirthday() {
		System.out.println("in getter " + birthday );
		return birthday;
	}
	public void setBirthday(Date birthday) {
		System.out.println("in setter " + birthday);
		this.birthday = birthday;
	}
	
	
	
}
