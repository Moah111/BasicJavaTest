package fresher.java.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	private String id;//ma so
	private String title;//chuc danh
	private String name;//ten 
	private String field;//linh vuc
	private String position;//chuc vu
	private double salary;//luong
	private String departmentID;//ma bo phan
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	
	

	@Override
	public String toString() {
		return "Employee name : "+ name +"\n"+"ID : " + id + "\n"+"Linh vuc : "+ 
		field +"\n"+"Chuc vu : "+ position+"\n"+"Luong thang : "+"\n"+ "Ma phong ban : "+ departmentID;
	
	}
	public Employee(){
		
	}
	public Employee(String id, String title,String name,String field,String position,double salary,String departmentID){
		this.name = name;
		this.field = field;
		this.id = id;
		this.title = title;
		this.position = position;
		this.salary = salary;
		this.departmentID = departmentID;
	}
	
	public static Employee createEmployeeID(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Nhap Ten Nv : ");
		String name = sc.nextLine();
		
		
		System.out.println("nhap Linh vuc");
		String field = sc.nextLine();
		
		
		System.out.println("Nhap Chuc Vu");
		String position = sc.nextLine();
		
		
		System.out.println("Nhap Luong Thang");
		double salary = sc.nextDouble();
		

		
		
		String soID = null;
		for (int i = 0; i < 5; i++) {
			String left = "EM";
			Random rd = new Random();
			int right = rd.ints(10000,99999).findFirst().getAsInt();
			soID = left+right;
		}
		String emp = name+soID;
		
		
		Map<Integer,String > dsEmpID = new HashMap<>();
	
		return new Employee(soID, position,name,field,position,salary,"dsadsa");

	
		
	}

	
	public static void main(String[] args) {
		createEmployeeID();
	}
		
	
}
