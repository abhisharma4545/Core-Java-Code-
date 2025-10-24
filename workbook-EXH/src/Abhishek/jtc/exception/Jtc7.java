package Abhishek.jtc.exception;
// User Defined Exception and throw....
public class Jtc7 {

	public static void main(String[] args) {
		StudentService serv = new StudentService();
		try {
			String nm = serv.getStudentName(-23);
			System.out.println("in Main Name\t:"+nm);
		}catch (Exception e) {
			 e.printStackTrace();
		}
		System.out.println();
		try {
			String nm =serv.getStudentName(98);
			System.out.println("in Main Name\t:"+nm);
		}catch (Exception e) {
			
           System.out.println(e.getMessage());
		   //System.out.println(e.getCause());
		  System.out.println("-----");
		  //e.printStackTrace();
		}
	   System.out.println("\n-Main Completed--");
	    
	}
}
class StudentService{
	String getStudentName(int id) {
		String nm = null;
		//Db
		if(id<1) {
			throw new InvalidIdException(id);
		}else if(id==98) {
			StudentNotFoundException e = new StudentNotFoundException();
			e.initCause(new IdNotFoundException(id));
			throw e;
		}
		nm = "Somprakash";
		return nm;
	}
}

class InvalidIdException extends RuntimeException{
	int id;
	InvalidIdException(int id){
		this.id = id;
		
	}
	public String getMessage() {
		return String.valueOf(id);
	}
}
class StudentNotFoundException extends RuntimeException{}
class IdNotFoundException extends RuntimeException{
	int id;
	 public IdNotFoundException(int id) {
		super(String.valueOf(id));
	}
}