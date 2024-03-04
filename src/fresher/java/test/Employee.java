package fresher.java.test;

public class Employee {
	private int id;//ma so
	private String title;//chuc danh
	private String name;//ten 
	private String field;//linh vuc
	private String position;//chuc vu
	private double salary;//luong
	private String departmentID;//ma bo phan
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Employee(int id, String title,String name,String position,double salary,String departmentID){//thieu linh vuc
		this.name = name;
		this.field = field;
		this.id = id;
		this.title = title;
		this.position = position;
		this.salary = salary;
		this.departmentID = departmentID;
	}

}
