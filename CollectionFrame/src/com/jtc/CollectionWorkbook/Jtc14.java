package com.jtc.CollectionWorkbook;
// Examole using ResourceBundle and properties file..
import java.util.*;
import java.io.*;
public class Jtc14 {
   public static void main(String[] args) throws IOException{
	   Properties p =new Properties();
       File fr=new File("data.properties");
	   fr.createNewFile();
//	   FileOutputStream fos=new FileOutputStream(fr);
//	   fos.write('k');
//	   fos.flush();
//	   fos.close();
	   FileInputStream fis=new FileInputStream(fr);
	   p.load(fis);
//	  int a= fis.read();
//	  System.out.println((char)a);
//	   System.out.println("dhadh");
//	   fis.close();
//	Properties p =new Properties();
//	//FileReader  fr=new FileReader("data.properties");
//	
//	FileInputStream fis = new FileInputStream("data.properties");
//	p.load(fis);
//	System.out.println("hjd");
	Enumeration en =p.propertyNames();
	while (en.hasMoreElements()) {
		String key= (String) en.nextElement();
		System.out.println(key +"\t"+p.getProperty(key));
		
	}
	fis.close();
	System.out.println("H\tHindi");
	System.out.println("E\tEnglish");
//	 Scanner sc = new Scanner(System.in);
//      String s1 =sc.nextLine();
	 System.out.println("Enter laugauge code");
	
	 char ch =(char)System.in.read();
	ch = Character.toUpperCase(ch);
	Locale loc = new Locale("en","IN");
	if(ch=='H') {
		loc =new Locale("hi","IN");
	}
		else if(ch=='E') {
			loc =new Locale("en","IN");
			
		}
		else {
			System.out.println("Not valid Option,Reading English Langauge");
		}
	System.out.println("\n----Rsource Bundle-----");
	System.out.println(loc);
	ResourceBundle rb = ResourceBundle.getBundle("data",loc);
	Enumeration en1 =rb.getKeys();
	while (en1.hasMoreElements()) {
		String ky= (String) en1.nextElement();
		System.out.println(ky+" \t"+rb.getString(ky));
		
	}
	System.out.println("\n-------Reading specific key value---");
	String val  = rb.getString("sid");
	System.out.println("Valueof\t:"+val);
	}
}


