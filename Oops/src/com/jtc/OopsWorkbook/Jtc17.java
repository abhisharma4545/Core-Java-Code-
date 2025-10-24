package com.jtc.OopsWorkbook;
// Example using reference the object from Inner Class.....
 public class Jtc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc ref = new Abc("Welcome");
		Abc.Pqr ref2 = ref.new Pqr(3232);
		ref2.show();
		System.out.println();
		new Abc("THANKS").new Pqr(4141).show();
		

	}

}
class Abc{
	static String stVar = "STATIC IN Outer";
	String var;
	 Abc(String var) {
		// TODO Auto-generated constructor stub
		 this.var=var;
	}
	
class Pqr{
	final static String stVAr = "STATIC IN Inner";
	int var;
	Pqr(int var) {
		// TODO Auto-generated constructor stub
		this.var=var;
	}
	void show() {
		boolean var = false;
		System.out.println("\n--in Show Method -- in Inner Class");
		System.out.println(var);
		System.out.println(this.var);
		System.out.println(Abc.stVar);
		System.out.println(Pqr.stVAr);
		System.out.println(Abc.this);
		System.out.println(Abc.this.var);
	}
	
}
}
