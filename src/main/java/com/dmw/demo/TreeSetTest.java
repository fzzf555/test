package com.dmw.demo;

import java.util.TreeSet;

class Parent implements Comparable{
	private int age;
	public Parent(int age) {
		this.age = age;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		System.out.println("method in parent");
		Parent parent = (Parent) o;
		return age > parent.age ? 1 : age < parent.age ? -1 : 0;
	}		
}
class Child extends Parent {

	public Child() {
		super(3);
	}
	
	public int compareTo(Object o){
		System.out.println("method in child");
		Child child = (Child) o;
		return 1;
	}
}

public class TreeSetTest{
	public static void main(String[] args){
		TreeSet treeSet = new TreeSet<>();
		treeSet.add(new Parent(3));
		treeSet.add(new Child());
		treeSet.add(new Parent(4));
		System.out.println(treeSet.size());
	}
}
