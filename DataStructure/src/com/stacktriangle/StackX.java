package com.stacktriangle;

public class StackX {
	private int maxsize;
	private Params[] stackArray;
	private int top;
	
	public StackX(int s)
	{
		maxsize=s;
		stackArray=new Params[maxsize];
		top=-1;
	}
	public void push(Params p)
	{stackArray[++top]=p;}
	public Params pop()
	{return stackArray[top--];}
	public Params peek()
	{return stackArray[top];}
	
}
