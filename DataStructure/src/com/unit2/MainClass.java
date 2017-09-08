package com.unit2;

import org.junit.Test;

public class MainClass {
	@Test
	public void testoddEvenSort()
	{
		ArraySort arrayBubble=new ArraySort(6);
		arrayBubble.insert(2);
		arrayBubble.insert(4);
		arrayBubble.insert(3);
		arrayBubble.insert(3);
		arrayBubble.insert(2);
		arrayBubble.insert(5);
		arrayBubble.oddEvenSort();
		arrayBubble.display();
		
	}
	@Test
	public void testBubble()
	{
		ArraySort arrayBubble=new ArraySort(6);
		arrayBubble.insert(2);
		arrayBubble.insert(4);
		arrayBubble.insert(3);
		arrayBubble.insert(3);
		arrayBubble.insert(2);
		arrayBubble.insert(5);
		arrayBubble.insertSort();
		arrayBubble.display();
		arrayBubble.noDub();
		arrayBubble.display();
		
	}
	@Test
	public void testDouble()
	{
		HighArray highArray=new HighArray(6);
		highArray.insert(2);
		highArray.insert(4);
		highArray.insert(3);
		highArray.insert(2);
		highArray.insert(4);
		highArray.insert(4);
		highArray.display();
		highArray.noDub();
		highArray.display();

		
	}
	@Test
	public  void testArray() {
		OrdArray oa = new OrdArray(5);
		oa.insert(1);
		oa.insert(9);
		oa.insert(5);
		oa.insert(7);
		oa.insert(10);
		
		OrdArray ob=new OrdArray(4);
		ob.insert(2);
		ob.insert(8);
		ob.insert(3);
		ob.insert(6);
		OrdArray arr2=ob.merge(oa);
		arr2.display();
		
	}
	
}
