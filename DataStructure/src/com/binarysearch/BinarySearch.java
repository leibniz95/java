package com.binarysearch;

public class BinarySearch {
	private long []a;
	private int nElems;
	
	public int find(long searchKey)
	{
		int lowerBound=0;
		int upperBound=nElems-1;
		int curIn;
		
		while(true)
		{
			curIn=(lowerBound+upperBound)/2;
			if(a[curIn]==searchKey)
				return curIn;
			else if(lowerBound>upperBound)
				return nElems;
			else
			{
				if(a[curIn]<searchKey)
					lowerBound=curIn+1;
				else
					upperBound=curIn-1;
			}
			
		}
	}
	public BinarySearch(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		int j;
		for(j=0;j<nElems;j++)
			if(a[j]>value)
				break;
		for(int k=nElems;k>j;k--)
			a[k]=a[k-1];
		a[j]=value;
		nElems++;
	}

	public void display() {
		for (int j = 0; j < nElems; j++)
			System.out.print(a[j] + "	");
		System.out.println();
	}
	
	public int recFind(long searchKey,int lowerBound,int upperBound)
	{
		int curIn;
		
		curIn=(lowerBound+upperBound)/2;
		if(a[curIn]==searchKey)
			return curIn;
		else if(lowerBound>upperBound)
			return nElems;
		else
		{
			if(a[curIn]<searchKey)
				return recFind(searchKey,lowerBound,curIn-1);
			else
				return recFind(searchKey,lowerBound,curIn-1);
		}
	}
	public int find2(long value)
	{
		return recFind(value,0,nElems-1);
	}
}
