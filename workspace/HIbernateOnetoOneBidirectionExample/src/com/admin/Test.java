package com.admin;

import java.util.Scanner;

import com.service.ServiceI;
import com.service.ServiceImpl;

public class Test {
	public static void main(String[] args) {
		ServiceI s=new ServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		while(true) {

			System.out.println("PRESS 1 FOR INSERT PERSON DETAILS");
			System.out.println("PRESS 2 FOR DIPLAY DETAILS");
			System.out.println("PRESS 3 FOR UPDATE DETAILS");
			System.out.println("PRESS 4 FOR DELETE DETAILS");
			System.out.println("PRESS 5 FOR EXIT");

			int ch=sc.nextInt();
			switch (ch) {

			case 1:
				s.addDetails();
				break;

			case 2:
				s.displayAllDetails();
				break;

			case 3:
				s.updatPersonAllDetails();
				break;

			case 4:
				s.deleteDetails();
				break;
				
			case 5:
				System.exit(0);

			default:
				System.out.println("thanking you");
				break;
			}
		}
	}

}
