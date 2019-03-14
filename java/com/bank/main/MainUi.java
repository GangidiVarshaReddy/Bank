package com.bank.main;

import java.util.Scanner;

import com.bank.bean.CustomerDetails;

public class MainUi {

	public static void main(String[] args) {
		CustomerDetails cd=new CustomerDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("*****menu*****");
		System.out.println("1.create account\n2.show balance\n3.deposit\n4.withdraw\n5.fund transfer\n6.print transactions");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("enter first name");
			cd.setFirstName(sc.next());
			System.out.println("enter last name");
			cd.setLastName(sc.next());
			System.out.println("enter email id");
	        cd.setEmail_id(sc.next());
	        System.out.println("enter aadhar card number");
            cd.setAadharNo(sc.next());
            System.out.println("enter pan card number");
            cd.setPancardNo(sc.next());
            System.out.println("enter address");
            cd.setAddress(sc.next());
            System.out.println("enter ");
		}
	}

}
