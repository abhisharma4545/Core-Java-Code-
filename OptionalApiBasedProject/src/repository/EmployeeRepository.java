package repository;

import EmployeeManagamentProject.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
public class EmployeeRepository {
	
	private final Map<Integer,Employee> employeeDatabase = new HashMap();
	public EmployeeRepository() {
		employeeDatabase.put(1, new Employee("Alka","Engineering","alka@gmail.com"));
		employeeDatabase.put(2, new Employee("Bob","HR",null));
		employeeDatabase.put(3, new Employee("Charli","Marketing","charlie@gmail.com"));
	}
	
	public Optional<Employee> findById(int id){
		return Optional.ofNullable(employeeDatabase.get(id));
	}
	

}
