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
	private DeDomain field;//linh vuc
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
	public DeDomain getField() {
		return field;
	}
	public void setField(DeDomain field) {
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
		field +"\n"+"Chuc vu : "+ position+"\n"+"Luong thang : " + salary +"\n"+ "Ma phong ban : "+ departmentID;
	
	}
	public Employee(){
		
	}
	public Employee(String id, String title,String name,DeDomain field,String position,double salary,String departmentID){
		this.name = name;
		this.field = field;
		this.id = id;
		this.title = title;
		this.position = position;
		this.salary = salary;
		this.departmentID = departmentID;
	}
	
	public static Employee createEmployeeID(){
		
		Department dep = new Department();
		DeDomain ded = new DeDomain();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Nhap Ten Nv : ");
		String name = sc.nextLine();
		
		
		System.out.println("nhap Linh vuc");
//		String field = sc.nextLine();
		DeDomain field = ded.getDomain() ;
		
		
		System.out.println("Nhap Chuc Vu");
		String position = sc.nextLine();
		
		
		System.out.println("Nhap Luong Thang");
		double salary = sc.nextDouble();
		
		Map<String,String > dsEmpID = new HashMap<>();
		
		String soID = null;
		for (int i = 0; i < 5; i++) {
			String left = "EM";
			Random rd = new Random();
			int right = rd.ints(10000,99999).findFirst().getAsInt();
			soID = left+right;
		}
		String empID = name+" : "+soID;
		System.out.println(empID);
		dsEmpID.put(name, empID);
		System.out.println(dsEmpID);
		System.out.println(new Employee(soID, position,name,field,position,salary,dep.getDeID()));
		
		
		return new Employee();
		

	
		
	}

	

	
	
}
