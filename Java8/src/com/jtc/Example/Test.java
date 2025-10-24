package com.jtc.Example;

import java.security.PublicKey;

interface Animal{
	void eating();
	void sleeping();
	default  void running() {
		System.out.println("running in Animal");
	}
	default void thinking() {
		System.out.println("thinking in Animal");
	}
}

class Dog implements Animal{
	public void eating() {
		System.out.println("dog is eating");
	}
	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("dog is sleeping");
		
	}
	@Override
	public void thinking() {
		// TODO Auto-generated method stub
		System.out.println("dog is thinking");
	}
	
}
class Cat implements Animal{
	public void eating() {
		System.out.println("Cat is eating");
	}
	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("Cat is sleeping");
		
	}
	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("Cat is running");
	}
	
	
	
}
public class Test {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.sleeping();
		ani.eating();
		ani.running();
		ani.thinking();
				
	}

}
