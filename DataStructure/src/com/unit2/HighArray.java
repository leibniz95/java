package com.unit2;

public class HighArray {
	private long[] a;
	private int nElems;

	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	// 查找指定元素是否存在
	public boolean find(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++)
			if (a[j] == searchKey)
				break;
		if (j == nElems)
			return false;
		else
			return true;
	}

	// 元素插入数据
	public void insert(long value) {
		a[nElems++] = value;
	}

	// 删除指定元素
	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++)
			if (value == a[j])
				break;
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
			System.out.print(a[j] + "  ");
		System.out.println();
	}

	/* 添加一个名为getMax()，它返回数组中最大值，为空时返回一1。 */
	public long getMax() {
		long max = a[0];
		if (nElems == 0)
			return -1;
		for (int j = 1; j < nElems; j++) {
			if (max < a[j])
				max = a[j];
			else
				continue;
		}
		return max;
	}

	public void removeMax() { //2.3
		delete(getMax());// 删除最大值
	}
	
	//根据指定下标删除元素
	public boolean remove(int i)
	{
		if(i>nElems||i<0)//判断下标是否越界
			return false;
		for (int k = i; k < nElems - 1; k++)
			a[k] = a[k + 1];
		nElems--;
		return true;
		
	}
	public void noDub()// 删除所有重复值,无序,暴力破解    2.6
	{
		for(int i=0;i<nElems;i++)//求没有重复数组的长度
		{
			for(int j=i+1;j<nElems;j++)
				if(a[i]==a[j])
					remove(j);//删除后面相同相同的元素
		}
	}
}
