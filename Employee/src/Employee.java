
public class Employee {
	private String name;
	private int salary;
	private int age;
	public Employee (String name, int age){
		this.age = age;
		name = employee;
		this.salary = salary;
	}
	public String toString(){
		return name + ", " + age + "éves," + salary + "ft" + yearsLeftToPension() + "év van nyugdíjig"; 
	}
	public void SetPensionageLimit (int limit){
		pensionAgeLimit = limit;
	}
	public static Employee hasMoreYearsTillPension(Employee firstEmployee, Employee secondEmployee){
		if (firstEmployee.yearsLeftToPension()>=secondEmployee.yearsLeftToPension()){
			return firstEmployee;
		}
		return secondEmployee;
	}
	
}
