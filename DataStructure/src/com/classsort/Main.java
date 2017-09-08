package com.classsort;

import org.junit.Test;

public class Main {
	@Test
	public  void testClass() {
		int MaxSize=100;
		ArrayInOb arr=new ArrayInOb(MaxSize);
		
		arr.insert("enans", "party", 24);
		arr.insert("g", "jik", 27);
		arr.insert("jiij", "qawe", 14);
		arr.insert("ads", "trfa", 4);
		arr.insert("asdf", "afweg", 15);
		arr.insert("enans", "party", 24);
		
		arr.display();
		
		arr.insertSort();
		
		arr.display();
		
	}
}
