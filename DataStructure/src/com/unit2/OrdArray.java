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

	// ��������
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

	
//	 2.5��orderedArray.java����(�嵥2.4)��OrdArray�����һ��merge()������ʹ֮���Խ�
//	  ���������Դ����ϲ���һ�������Ŀ�����顣��main()����Ӵ��룬������Դ�����в����������
//	  ����merge()�������������Ŀ��������ʾ����������Դ�����������������ܲ�ͬ�����㷨����
//	  Ҫ�ȱȽ�Դ�����еĹؼ��֣�����ѡ����С��һ��������Ƶ�Ŀ�����顣ͬʱ��Ҫ������ν�� ��һ��Դ������������Ѿ�ȡ�����һ����ʣһЩ������������
	 //�ҵĴ����ǽ��俴��һ��������û�кͶ������ӣ����벻��
	
	public OrdArray merge(OrdArray ordArray)
	{
		OrdArray dist=new OrdArray(this.nElems+ordArray.nElems);
		for(int i=0;i<ordArray.size();i++)//����ֵ�Ķ���
		{
			dist.insert(ordArray.a[i]);
		}
		for(int i=0;i<this.size();i++)
		{
			dist.insert(this.a[i]);//����������������ֵ
		}
		return dist;
	}
}
