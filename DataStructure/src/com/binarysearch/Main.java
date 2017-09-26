package com.binarysearch;

public class Main {
	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch(5);
		bs.insert(5);
		bs.insert(8);
		bs.insert(1);
		bs.insert(9);
		bs.insert(2);
		bs.display();
		System.out.println(bs.find2(5));
	}
}
