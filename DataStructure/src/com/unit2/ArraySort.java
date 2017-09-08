package com.unit2;

public class ArraySort {
	private long[] a;
	private int nElems;

	public ArraySort(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int j = 0; j < nElems; j++)
			System.out.print(a[j] + "	");
		System.out.println();
	}
	/*3.1  bubbleSort.java����(�嵥3.1)��BubbleSortר��applet�У�in�����������Ǵ������ƶ��ģ�
	ֱ���ҵ��������������ƶ����ұߵ�out���������޸�bubbleSort()������ʹ����Ϊ˫���ƶ��ġ�������in����������ǰһ����
	����������������Ƶ��ң���������out����λ��ʱ������ͷ������С������������Ƶ���
	��Ҫ�����ⲿ����������һ�����ұ�(��ǰ��out����)����һ������ߡ�*/
	public void bubbleSort() {
		int out, in;
		boolean flag;
		for (out = nElems - 1; out > 1; out--) {
			flag = false;
			for (in = 0; in < out; in++)
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
					flag = true;
				}
			if(flag==false)
				return ;
			
		}
	}

	public void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	public void selectSort()
	{
		int out,in,min;//2 4 3 2 7 5
		for(out=0;out<nElems-1;out++)
		{
			min=out;
			for(in=out+1;in<nElems;in++)
				if(a[in]<a[min])
					min=in;//�õ���Сֵ������
			swap(out,min);
		}
	}
	
	public void insertSort()
	{
		int in,out;
		for(out=1;out<nElems;out++)
		{
			long temp=a[out];
			in=out;
			while(in>0&&a[in-1]>=temp)
			{
				a[in]=a[in-1];
				--in;
			}
			a[in]=temp;
		}
	}
	/*3.2��insertSort.java����(�嵥3.3)�и�ArrayIn:���һ��median()�������������������
	������м�ֵ��(����һ�£�������һ����������м�ֵ��һ����������м�Сֵ��)*/
	public long median()
	{
		return a[(nElems-1)/2];
	}
	
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
		int len=nElems;
		for(int i=0;i<nElems;i++)//��û���ظ�����ĳ���
		{
			for(int j=i+1;j<nElems;j++)
			{
				if(a[i]==a[j])
				{
					len--;
					remove(j);//ɾ��������ͬ��ͬ��Ԫ��
				}
			}
		}
	}
	
	public void oddEvenSort()
	{
		//�õ�a[]
		int out, in;
		boolean flag;
		for (out = (nElems)/2; out > 1; out-=2) {
			flag = false;
			for (in = 0; in < out; in+=2)
				if (a[in] > a[in + 2]) {
					swap(in, in + 2);
					flag = true;
				}
			
			for (in = 1; in < out; in+=2)
				if (a[in] > a[in + 2]) {
					swap(in, in + 2);
					flag = true;
				}
			if(flag==false)
				break ;
		}//�˷������У���������ż�����򣬲�������������
		this.bubbleSort();
	}
	
}
