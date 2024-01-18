package com.admin;

import java.util.Scanner;

import com.service.ServiceI;
import com.service.ServiceImpl;

public class Test {

	public static void main(String[] args) {

		ServiceI s=new ServiceImpl();
		Scanner sc=new Scanner(System.in);

		while(true) {

			System.out.println("PRESS 1 FOR ENTER YOUR DETAILS");
			System.out.println("PRESS 2 FOR DISPLAY YOUR DETAILS");
			System.out.println("PRESS 3 FOR UPDATE YOUR DETAILS");
			System.out.println("PRESS 4 FOR update perticular DETAILS");
			System.out.println("PRESS 5 FOR DELETE YOUR ALL DETAILS");
			System.out.println("PRESS 6 FOR DELETE YOUR PERTICULAR DETAILS");
			System.out.println("PRESS 7 FOR EXIT");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				s.insertAllData();
				break;

			case 2:
				s.displayAllData();
				break;

			case 3:
				s.updateAllData();
				break;

			case 4:
				s.updateperticularData();
				break;

			case 5:
				s.deleteAllData();
				break;

			case 6:
				s.deleteperticularData();
				break;

			case 7:
				System.exit(0);

			default:
				System.out.println("THANKING YOU");
				break;
			}
		}
	}
}
