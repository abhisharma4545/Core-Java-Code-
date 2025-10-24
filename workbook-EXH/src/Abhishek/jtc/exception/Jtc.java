package Abhishek.jtc.exception;

public class Jtc {
	
   public static void main(String[] as) {
		System.out.println();
		try {
			int x = Integer.parseInt(as[2]);
			System.out.println(x);
			int y =10/x;
			System.out.println(y);
		}
		//System.out.println("not ok");
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide the value");
			System.out.println(e);	
		}
		catch (NumberFormatException e) {
			System.out.println("Please provide integer number");
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println("Please dont provide zero");
			System.out.println(e);
		}
		catch (Exception e) {
		   System.out.println("Please dont do this");
		   System.out.println(e);
		   
		}
		System.out.println("Main End");
	}

}
