package fresher.java.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Department {
	private String departmentID;
	private String name;
	private String domain;
	
	public static void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Lua Chon Hanh Dong...");
		int chon = sc.nextInt();	
		
			switch(chon){
			
			case 1:
				System.out.println("Them Bo Phan Moi : ");break;
			case 2:
				System.out.println("Tim Kiem Phong ban : ");break;
			case 3:
				System.out.println("Them Nhan Vien Moi : ");break;
			case 4:
				System.out.println("Them Nhan Vien Vao Bo Phan Moi : ");break;
			case 5:
				System.out.println("Danh Sach Nhan Vien Theo Phong Ban : ");break;
			}	
	}
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.toString();
		menu();
		}
}

