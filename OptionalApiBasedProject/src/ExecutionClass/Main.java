package ExecutionClass;
import repository.EmployeeRepository;
import EmployeeManagamentProject.Employee;
import Service.EmployeeService;
import java.util.Optional;

public class Main {
	  public static void main(String[] args) {
		  EmployeeRepository  repository = new EmployeeRepository();
		  EmployeeService service = new EmployeeService(repository);
//		  State 1: Employee ka  name(present Employee)
		  System.out.println("ID 1 Ka name:"+service.getEmployeeName(1));
//		  Test2: Employee Ka name (Non Present Employee)
		  System.out.println("ID 999 ka name:"+service.getEmployeeName(999));
//		  Test3: Employee ka email(email ke sath Employee)
		  try {
			System.out.println("Id 1 ka email:"+service.getEmployeeEmail(1));
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
//		  Test4:Employee ka email(bina email ke  Employee)
		  try {
			System.out.println("Id 2 ka email:"+service.getEmployeeEmail(2));
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
//		  Test5: print the department...
		  service.printDeparment(1);
//		  Test6: Filter based on Department...
		  Optional<Employee> filtered = service.findByIdAndDeparment(1, "Engineering");
		  filtered.ifPresent(emp->System.out.println("Filter kiya gya karmchari:"+emp));
		  
//		  Test7: galat department se filter..
		  Optional<Employee> notFound = service.findByIdAndDeparment(1, "HR");
		  System.out.println("HR mein Employee:"+notFound.orElse(null));
	}


}
