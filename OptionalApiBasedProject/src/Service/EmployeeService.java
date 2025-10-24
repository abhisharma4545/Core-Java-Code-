package Service;
import repository.EmployeeRepository;
import EmployeeManagamentProject.Employee;
import java.util.Optional;

public class EmployeeService {

	private final EmployeeRepository repository;
	public EmployeeService(EmployeeRepository repository) {
		this.repository=repository;
	}
//	Employee ka nam le ,agar na mile to Default
	public String getEmployeeName(int id) {
		return repository.findById(id).map(Employee::getName).orElse("Unknown Employee");
		
	}
	public String getEmployeeEmail(int id){
		return repository.findById(id).flatMap(emp->Optional.ofNullable(emp.getEmail())).orElseThrow(()->new IllegalArgumentException("Employee or email is not found Id:"+id));
		
	}
//	Deparment Print kare agarEmployee is Present
	public void printDeparment(int id) {
		repository.findById(id).ifPresent(emp->System.out.println("Deparment:"+emp.getDeparment()));
	}
//   department ke aadhar pr employee filter kare
	public Optional<Employee> findByIdAndDeparment(int id,String deapartment){
		return repository.findById(id).filter(emp->emp.getDeparment().equalsIgnoreCase(deapartment));
	}
	
}
