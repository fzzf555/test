package com.dmw.demo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.*;
import java.nio.charset.CodingErrorAction;

public class IntArrayDemo {
	public static void main(String[] args) {
		Class class1 = int.class;
		Object object = Array.newInstance(class1, 10);
		for(int i = 0;i < 10;i++){
			Array.set(object, i, i);
		}
		
		int [] array = (int[]) object;
		System.out.println(Arrays.toString(array));
		
	}
}
