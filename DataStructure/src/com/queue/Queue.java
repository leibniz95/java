package com.queue;

public class Queue {
	private int maxsize;
	private long[] queArray;
	private int front;
	private int rear;
	
	public Queue(int s)
	{
		maxsize=s;
		queArray=new long[maxsize];
		front=0;
		rear=-1;
	}
	
	public void insert(long j)
	{
		if(rear==maxsize-1)
			rear=-1;
		queArray[++rear]=j;
	}
	
	public long remove()
	{
		long temp=queArray[front++];
		if(front==maxsize)
			front=0;
		return temp;
	}
	public long peekFront()
	{
		return queArray[front];
	}
	
	public boolean isEmpty()
	{
		return (rear+1==front||(front+maxsize-1==rear));
	}
	
	public boolean isFull()
	{
		return (rear+2==front||(front+maxsize-2==rear));
	}
	
	public int size()
	{
		return rear>=front?(rear-front+1):((maxsize-front)+(rear+1));
	}
	
	public void display()
	{
		for(int i=0;i<queArray.length;i++)
		{
			System.out.print(queArray[i]+" ");
		}
		System.out.println();
	}
}
