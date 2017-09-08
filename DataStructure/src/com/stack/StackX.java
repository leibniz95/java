package com.stack;

public class StackX {
	private int maxsize;
	private char []stackArray;
	private int top;
	
	public StackX(int s)
	{
		maxsize=s;
		stackArray= new char [maxsize];
		top=-1;
	}
	
	public void push(char j)
	{stackArray[++top]=j;}
	
	public char pop()
	{return stackArray[top--];}
	
	public char peek()
	{return stackArray[top];}
	
	public boolean isEmpty()
	{return (top==-1);}
	
	public boolean isFull()
	{return (top==maxsize-1);}
	
	public char peekN(int n)
	{return stackArray[n];}
	
	public int size()
	{return top+1;}
	public void displayStack(String s)
	{
		System.out.print(s);
		System.out.println("Stack{bottom-->top}:");
		for(int j=0;j<size();j++)
		{
			System.out.print(peekN(j));
			System.out.print(' ');
		}
		System.out.println();
	}
}
