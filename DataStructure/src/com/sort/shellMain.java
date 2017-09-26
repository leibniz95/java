package com.sort;

public class shellMain {
	public static void main(String[] args) {
		/*int maxsize=10;
		ArraySh arr;
		arr=new ArraySh(maxsize);
		
		for(int j=0;j<maxsize;j++)
		{
			long n=(long) (Math.random()*100);
			arr.insert(n);
		}
		arr.display();
		arr.shellSort();
		arr.display();*/
		int maxsize=10;
		QSort arr;
		arr=new QSort(maxsize);
		
		for(int j=0;j<maxsize;j++)
		{
			long n=(long) (Math.random()*10);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}
}
