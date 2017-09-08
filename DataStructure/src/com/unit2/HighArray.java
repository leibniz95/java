package com.unit2;

public class HighArray {
	private long[] a;
	private int nElems;

	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	// ����ָ��Ԫ���Ƿ����
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

	// Ԫ�ز�������
	public void insert(long value) {
		a[nElems++] = value;
	}

	// ɾ��ָ��Ԫ��
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

	/* ���һ����ΪgetMax()�����������������ֵ��Ϊ��ʱ����һ1�� */
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
		delete(getMax());// ɾ�����ֵ
	}
	
	//����ָ���±�ɾ��Ԫ��
	public boolean remove(int i)
	{
		if(i>nElems||i<0)//�ж��±��Ƿ�Խ��
			return false;
		for (int k = i; k < nElems - 1; k++)
			a[k] = a[k + 1];
		nElems--;
		return true;
		
	}
	public void noDub()// ɾ�������ظ�ֵ,����,�����ƽ�    2.6
	{
		for(int i=0;i<nElems;i++)//��û���ظ�����ĳ���
		{
			for(int j=i+1;j<nElems;j++)
				if(a[i]==a[j])
					remove(j);//ɾ��������ͬ��ͬ��Ԫ��
		}
	}
}
