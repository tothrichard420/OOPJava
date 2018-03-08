package my.first;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		Alkalmazott[] employeeArray = new Alkalmazott[3];
		for (int i = 0; i < employeeArray.length; i++) {
			employeeArray[i] = new Alkalmazott();
			employeeArray[i].setName("employee"+(i+1));
			employeeArray[i].setSalary(Math.abs(new Random().nextInt()));
		}
		for (Alkalmazott employee : employeeArray){
			System.out.println(employee);
		}
		Alkalmazott employeeWithHighestSalary=employeeArray[0];
		for (int i = 0; i < employeeArray.length; i++) {
			if(employeeWithHighestSalary.isBiggerSalary(employeeArray[i])){
				employeeWithHighestSalary=employeeArray[i];
			}
		}
		System.out.println("legmagasabb fizetés:" + employeeWithHighestSalary);
		double averageSalary = 0.0;
		for (int i = 0; i < employeeArray.length; i++) {
			averageSalary+=employeeArray[i].getSalary();
		}
		averageSalary = averageSalary/employeeArray.length;
		System.out.println("Average: " + (long)averageSalary);
		double sumTax = 0.0;
		for (int i = 0; i < employeeArray.length; i++) {
			sumTax+=employeeArray[i].getTax();
		}
		System.out.println("Tax: " + (long)sumTax);
	}

}
