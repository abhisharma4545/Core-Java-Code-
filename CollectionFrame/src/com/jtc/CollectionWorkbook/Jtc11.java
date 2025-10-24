package com.jtc.CollectionWorkbook;
import java.util.*;
// Example using Locale....
public class Jtc11 {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		Locale locals[]=Locale.getAvailableLocales();
		for(int i=0;i<locals.length;i++) {
			System.out.println(locals[i]+", ");
			
		}
		System.out.println("\n");
		String countries[]=Locale.getISOCountries();
		for(int i=0;i<countries.length;i++) {
			System.out.println(countries[i]+", ");
			
		}
		System.out.println("\n");
		String laungauges[]= Locale.getISOLanguages();
		for(int i=0;i<laungauges.length;i++) {
			System.out.println(laungauges[i]+",");
			
		}
		System.out.println();
		Locale loc = new Locale("EN");
		System.out.println(loc.getCountry());
		System.out.println(loc.getDisplayCountry());
		System.out.println(loc.getDisplayLanguage());
		System.out.println(loc.getDisplayName());
		System.out.println(loc.getVariant());
		System.out.println(loc.getDisplayVariant());
		Locale loc1 =new Locale("EN","US");
		System.out.println(loc1.getCountry());
		System.out.println(loc1.getDisplayCountry());
		System.out.println(loc1.getDisplayLanguage());
		System.out.println(loc1.getDisplayName());
		
		
	}

}
