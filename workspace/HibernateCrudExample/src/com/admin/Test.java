package com.admin;

import java.util.Scanner;

import com.service.ServiceI;
import com.service.ServiceImpl;

public class Test {
	public static void main(String[] args) {
		ServiceI s=new ServiceImpl();
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 For Register Details");
			System.out.println("Press 2 For Display Details");
			System.out.println("Press 3 For Update Previous Details");
			System.out.println("Press 4 For Delete Details");
			System.out.println("Press 5 for update by new way");
			System.out.println("Press 6 For Exit From Table");
			int ch=sc.nextInt();


			switch(ch){

			case 1:
				s.addUser();
				break;

			case 2:
				s.displayDetails();
				break;

			case 3:
				s.updateDetails();
				break;

			case 4:
				s.deleteDetails();
				break;
				
			case 5:
				s.updateNewWay();
			    break;
			    
			case 6:
				System.exit(0);

			default:
				System.out.println("THANKING YOU");	
			}
		}
	}
}
