
import java.time.LocalDate;

public class Employee {
	
	private static int pensionAgeLimit = 50;
	private String name;
	private Integer salary;
	private LocalDate birthDate;

	
	public Employee(String employeeName, int salary, LocalDate birthDate) {
		this.birthDate = birthDate;
		name = employeeName;
		this.salary = salary;
	}

	public Employee() {
		birthDate = LocalDate.now();
		salary = 0;
		name = "";
	}

	public Employee(String name, LocalDate birthDate) {
		this.birthDate = birthDate;
		this.name = name;
		salary = 10000 * (LocalDate.now().getYear() - birthDate.getYear());
	}

	
	public int yearsLeftToPension() {
		return pensionAgeLimit - (LocalDate.now().getYear() - birthDate.getYear());
	}

	
	public String toString() {
		return name + ", sz�letett: " + birthDate.getYear() + ". " + birthDate.getMonthValue() + ". "
				+ birthDate.getDayOfMonth() + " ," + salary + "ft " + yearsLeftToPension() + "�v van nyugd�jig";
	}

	
	public static void setPensionageLimit(int limit) {
		pensionAgeLimit = limit;
	}

	

	public static Employee hasMoreYearsTillPension(Employee firstEmployee, Employee secondEmployee) {
		if (firstEmployee.yearsLeftToPension() >= secondEmployee.yearsLeftToPension()) {
			return firstEmployee;
		}
		return secondEmployee;
	}
	
	private static String getNameFromNumber(int number){
		String[] months = new String[12];
		months[1]="Jan";
		months[2]="Feb";
		months[3]="M�rc";
		months[4]="�pr";
		months[5]="M�j";
		months[6]="J�n";
		months[7]="J�l";
		months[8]="Aug";
		months[9]="Szept";
		months[10]="Okt";
		months[11]="Nov";
		months[12]="Dec";
		return months[number];
	}
	

	public boolean isBetweenSalary(int lowerSalary, int upperSalary) {
		if (salary < upperSalary && salary > lowerSalary) {
			return true;
		}
		return false;
	}

	public boolean hasBiggerSalary(Employee otherEmployee) {
		if (salary < otherEmployee.salary) {
			return true;
		}
		return false;

	}

	public double getTax() {
		return salary * 0.16;
	}

	public void raiseSalary(int raise) {
		salary += raise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}