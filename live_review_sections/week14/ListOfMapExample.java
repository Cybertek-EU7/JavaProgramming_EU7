package week14;

import java.util.*;

public class ListOfMapExample {

	public static void main(String[] args) {
		
		Map<String,String> empOneData = new LinkedHashMap<>();
		empOneData.put("EmpID", "123");
		empOneData.put("EmpName", "John"); // my name is Earl
		empOneData.put("JobTitle", "SDET");
		empOneData.put("Salary","100_000");
		System.out.println(empOneData);
		
		Map<String,String> empTwoData = new LinkedHashMap<>();
		empTwoData.put("EmpID", "124");
		empTwoData.put("EmpName", "Mike"); // my name is Earl
		empTwoData.put("JobTitle", "Developer");
		empTwoData.put("Salary","120_000");
		System.out.println(empTwoData);
		
		
	// I want to get Mike's salary
		System.out.println(empTwoData.get("EmpName")
				+" gets $"  + empTwoData.get("Salary"));
		
	// to put all employees info together with JAVA collections
		
		List<Map<String,String>> employeesList = new ArrayList<>();
		
		employeesList.add(empOneData);
		employeesList.add(empTwoData);
		
		// employeesList.add(new LinkedHashMap<>());
		
		System.out.println(employeesList);
		
		for(Map<String,String> emp : employeesList) {
			if(emp.get("EmpName").equals("Mike")) {
				System.out.println(emp.get("Salary"));
			//	employeesList.remove(emp);
			}
		}
		
		System.out.println(employeesList);
		
		
		// You have finished JAVA BRAVO to Everybody
		
	}
	
	
}
