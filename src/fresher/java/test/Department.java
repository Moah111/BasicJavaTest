package fresher.java.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Department {
	private  int departmentID;
	private String name;
	private String domain;
	
	
	
	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void addDepartment(){
		Scanner sc = new Scanner(System.in);
		int departmentID = sc.nextInt();
		String name = sc.next();
		String domain = sc.nextLine();
		this.name = name;
		this.domain = domain;
		this.departmentID = departmentID;
		
	}
	
	public static void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Lua Chon Tinh Nang...");
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
//		System.out.println(emp.toString());
		menu();
		}
}

