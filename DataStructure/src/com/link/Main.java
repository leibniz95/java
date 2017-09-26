package com.link;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class Main {
	@Test
	public void testIterator() throws IOException
	{
		LinkList theList=new LinkList();
		ListIterator iter1=theList.getIterator();
		long value;
		
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(80);
		iter1.insertBefore(60);
		
		while(true)
		{
			System.out.print("Enter first letter of show, reset");
			System.out.print("next,get,before,after,delete");
			System.out.flush();
			
			int choice=getChar();
			switch(choice)
			{
			case 's':
				if(!theList.isEmpty())
					theList.displayList();
				else
					System.out.println("List is empty");
				break;
			case 'r':
				iter1.reset();
				break;
			case 'n':
				if(!theList.isEmpty()&&!iter1.atEnd())
					iter1.nextLink();
				else
					System.out.println("can't go to next link");
				break;
			case 'g':
				if(!theList.isEmpty())
				{
					value=iter1.getCurrent().dData;
					System.out.println("returned"+value);
				}
				else
					System.out.println("List is empty");
				break;
			case 'b':
				System.out.println("Enter value to insert: ");
				System.out.flush();
				value=getInt();
				iter1.insertBefore(value);
				break;
			case 'a':
				System.out.println("Enter value to insert: ");
				System.out.flush();
				value=getInt();
				iter1.insertAfter(value);
				break;
			case 'd':
				if(!theList.isEmpty())
				{
					value=iter1.deleteCurrent();
					System.out.println("Deleted "+value);
				}
				else
					System.out.println("can't delete");
				break;
			default:
				System.out.println("Invalid entry");
			}
		}	
	}
	public static String getString() throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s =br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException
	{
		String s=getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException
	{
		String s=getString();
		return Integer.parseInt(s);
	}
	@Test
	public void testSortList()
	{
		SortList theSortList=new SortList();
		
		theSortList.insert(20);
		theSortList.insert(30);
		theSortList.insert(25);
		theSortList.insert(70);
		theSortList.insert(66);
		theSortList.insert(54);
		
		theSortList.displayList();
		
		theSortList.remove();
		theSortList.displayList();
		
	}
	@Test
	public void testDouble()
	{
		FirstLastList theList=new FirstLastList();
		
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(66);
		
		theList.displayList();
		
		
		theList.deleteFirst();
		theList.deleteFirst();
		
		theList.displayList();
	}
//	@Test
//	public void testLinkList()
//	{
//		LinkList theList=new LinkList();
//		
//		theList.insertFirst(22, 2.99);
//		theList.insertFirst(44, 4.99);
//		theList.insertFirst(66, 6.99);
//		theList.insertFirst(88, 6.99);
//		
//		theList.displayList();
//		
//		while(!theList.isEmpty())
//		{
//			Link aLink=theList.deleteFirst();
//			System.out.println("deleted");
//			aLink.displayLink();
//			System.out.println();
//		}
//		theList.displayList();
//	}
}
