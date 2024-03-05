package fresher.java.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Department {
	private  int departmentID;
	private String name;
	private String domain;

	
	public static void addDepartment(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID Phong Ban : ");
		int departmentID = sc.nextInt();
		System.out.println("nhap Ten Phong Ban : ");
		String name = sc.next();
		System.out.println("Nhap domain : ");
		String domain = sc.nextLine();
	}
	
	
	public static void menu(){
		System.out.println("Them Bo Phan Moi : ");
		System.out.println("Tim Kiem Phong ban : ");
	}
	
	public static void  searchDE(){
		 
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		addDepartment();
		int n ;
		int chon;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon Tinh Nang : ");
		n = sc.nextInt();
		do{
			menu();
			chon = sc.nextInt();
			switch(chon){
			case 1: addDepartment();break;
			case 2: System.out.println("Dang Cap Nhat");
			}
			
		}while(chon!=0);
			
	}	
				
	
}

