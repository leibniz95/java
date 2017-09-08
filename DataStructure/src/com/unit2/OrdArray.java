package com.unit2;

public class OrdArray {
	private long[] a;
	private int nElems;

	public OrdArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = 0;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKey)
				return curIn;
			else if (lowerBound > upperBound)
				return nElems;
			else {
				if (a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
			}
		}
	}

	// 插入排序
	public void insert(long value) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j] > value)
				break;
		}
		for (int k = nElems; k > j; k--)
			a[k] = a[k - 1];
		a[j] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j = find(value);
		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems - 1; k++)
				a[k] = a[k + 1];
			nElems--;
			return true;
		}
	}

	public void display() {
		for (int j = 0; j < nElems; j++)
			System.out.print(a[j] + "	");
		System.out.println();
	}

	public long[] getArr() {
		return a;
	}

	
//	 2.5向orderedArray.java程序(清单2.4)的OrdArray类加入一个merge()方法，使之可以将
//	  两个有序的源数组合并成一个有序的目的数组。在main()中添加代码，向两个源数组中插入随机数，
//	  调用merge()方法，并将结果目的数组显示出来。两个源数组的数据项个数可能不同。在算法中需
//	  要先比较源数组中的关键字，从中选出最小的一个数据项复制到目的数组。同时还要考虑如何解决 当一个源数组的数据项已经取完而另一个还剩一些数据项的情况。
	 //我的代码是将其看成一个方法，没有和对象连接，代码不佳
	
	public OrdArray merge(OrdArray ordArray)
	{
		OrdArray dist=new OrdArray(this.nElems+ordArray.nElems);
		for(int i=0;i<ordArray.size();i++)//传入值的对象
		{
			dist.insert(ordArray.a[i]);
		}
		for(int i=0;i<this.size();i++)
		{
			dist.insert(this.a[i]);//插入这个对象的数组值
		}
		return dist;
	}
}
