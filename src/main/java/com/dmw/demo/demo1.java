package com.dmw.demo;

import org.omg.CORBA.PRIVATE_MEMBER;

//public class demo1 extends B  implements A  {
////	final int i;
////	//局部变量不能用任何修饰符来修饰，只有final可以
////	void demo1(final Other o){
////		//private String s1 = "";
////		//int i = s1.length();
//////		o = new Other();
////		
////	}
////	public static void main(String[] args) {
////		Other other = new Other();
////		System.out.println(new demo1().i);
////	}
//	
////	public static String demo1(){
////		return "demo1()";
////	}
////	
////	public static void main(String [] args){
////		demo1 demo1 = new demo1();
////		System.out.println("return demo1.demo1() : " + demo1());
////	}
//	
//	public static void main(String[]args){
//		System.out.println(A.x);
//		System.out.println(new B().x);
//	}
//}

interface A{
	int x = 0;
}

class B{
	int x = 1;
}

class Other{
	public int i;
}

interface ABall{
	void play();
}

interface BBall{
	void play();
}



interface CBall extends ABall,BBall{
	demo1 demo1 = new demo1("pingpang");
}

public  class demo1 implements CBall{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public demo1(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void play() {
		demo1 = new demo1("lanqiu");
		System.out.println(demo1.name);
	}
	
}
