package com.queue;

public class PriorityQ {
	private int maxsize;
	private long[] queArray;
	private int nItems;
	
	public PriorityQ(int s)
	{
		maxsize=s;
		queArray=new long[maxsize];
		nItems=0;
	}
	
	public void insert(long item)
	{
		int j;
		if(nItems==0)
			queArray[nItems++]=item;//如果為空直接插入
		else
		{
			for(j=nItems-1;j>=0;j--)
			{
				if(item>queArray[j])
					queArray[j+1]=queArray[j];//很巧妙
				else
					break;
			}
			queArray[j+1]=item;
			nItems++;
		}
	}
	
	public long remove()
	{
		return queArray[--nItems];//刪除最小值
	}
	public long peekMin()
	{
		return queArray[nItems-1];//锁定在最小下标
	}
	
	public boolean isEmpty()
	{
		return (nItems==0);
	}
	
	public boolean isFull()
	{
		return (nItems==maxsize);
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
