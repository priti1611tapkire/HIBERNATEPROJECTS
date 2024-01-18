package com.admin;

import java.util.Scanner;

import com.service.ServiceI;
import com.service.ServiceImpl;

public class Test {
	public static void main(String[] args) {

		ServiceI s=new ServiceImpl();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Press 1 For Register Details");
			System.out.println("Press 2 For Display Details");
			System.out.println("Press 3 For Update Previous Details");
			System.out.println("Press 4 For Delete Details");
			System.out.println("Press 5 For Exit From Table");
			int ch=sc.nextInt();

			switch (ch) {
			case 1:
				s.insertStudentData();
				break;

			case 2:
				s.displayStudentData();
				break;

			case 3:
				s.updateStudentData();
				break;

			case 4:
				s.deleteStudentData();
				break;

			case 5:
				System.exit(0);
				break;
				
				
			default:
				System.out.println("----Thanking You-----");
				break;
			}
		}
	}

}


