package com.example;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		
		Employee emp=new Employee();
		emp.setId(01);
		emp.setName("Utkarsh");
		emp.setAddress("Kolhapur");
		
		System.out.println(emp);
		
		Address address=new Address();
		address.setId(1);
		address.setCity("Gadhinglaj");

		if(10>no)
		{
			System.out.println("10 is greater than 0");
		}
		else {
			System.out.println("No entered is greater than zero");
		}
		
		
	}

}
