package com.link;

public class LinkList {
	private Link first;
	public LinkList()
	{
		first=null;
	}
	public boolean isEmpty()
	{return (first==null);}
	
	public void insertFirst(long dd)
	{
		Link newLink= new Link(dd);
		newLink.next=first;
		first=newLink;
	}
	
	public Link deleteFirst()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	public void displayList()
	{
		System.out.println("List(first-->last): ");
		Link current=first;
		while(current !=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println();
	}
	
	public Link getFirst()
	{return first;}
	
	public void setFirst(Link f)
	{ first=f;}
	public ListIterator getIterator()
	{
		return new ListIterator(this);
	}
}
