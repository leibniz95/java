package com.link;

public class DoubleLink {
	public long dData;
	public DoubleLink next;
	
	public DoubleLink(long d)
	{dData=d;}
	
	public void disPlayLink()
	{
		System.out.println(dData+"  ");
	}
}
