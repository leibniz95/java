package com.link;

public class FirstLastList {
	private DoubleLink first;
	private DoubleLink last;
	
	public FirstLastList()
	{
		first=null;
		last=null;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public void insertFirst(long dd)
	{
		DoubleLink newLink=new DoubleLink(dd);
		if(isEmpty())
			last=newLink;
		newLink.next=first;
		first=newLink;
	}
	
	public void insertLast(long dd)
	{
		DoubleLink newLink=new DoubleLink(dd);
		if(isEmpty())
			first=newLink;
		else
			last.next=newLink;
		last=newLink;
	}
	
	public long deleteFirst()
	{
		long temp=first.dData;
		if(first.next==null)
			last=null;
		first=first.next;
		return temp;
	}
	
	public void displayList()
	{
		System.out.println("list(first-->last): ");
		DoubleLink current=first;
		while(current!=null)
		{
			current.disPlayLink();
			current=current.next;
		}
		System.out.println();
	}
}
