package com.java.p1;

import java.io.IOException;
// Runtime class implementations

class Jtc23{
	public static void main(String[] args) throws IOException {
		Runtime rt = null;
		//rt = new Runtime();
		//rt.availableProcessors();
		rt = Runtime.getRuntime(); 
		System.out.println(rt);
		System.out.println(Runtime.getRuntime());
		System.out.println(Runtime.getRuntime());
		System.out.println(Runtime.getRuntime());
		System.out.println(Runtime.getRuntime());
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		System.out.println(rt.maxMemory());
		System.out.println(rt.availableProcessors());
		// No_of_Processors env value
		Process p1 = rt.exec("notepad");
		Process p2 = rt.exec("calc");
		Process p3 = rt.exec("mspaint");
		System.out.println(System.getenv("path"));
		Process p4  = rt.exec("C:\\Program Files\\Windows Media Player\\wmplayer");
		//rt.exec("res.txt");
		System.out.println("Press Enter To Close Calculator");
		System.in.read();
		p1.destroy();
		p2.destroy();
		p3.destroy();
		p4.destroy();
				
	}

}
