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
	/*3.1  bubbleSort.java程序(清单3.1)和BubbleSort专题applet中，in索引变量都是从左到右移动的，
	直到找到最大数据项并把它移动到右边的out变量处。修改bubbleSort()方法，使它成为双向移动的。这样，in索引先像以前一样，
	将最大的数据项从左移到右，当它到达out变量位置时，它掉头并把最小的数据项从右移到左。
	需要两个外部索引变量，一个在右边(以前的out变量)，另一个在左边。*/
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
					min=in;//得到最小值的坐标
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
	/*3.2在insertSort.java程序(清单3.3)中给ArrayIn:类加一个median()方法。这个方法将返回
	数组的中间值。(回忆一下，数组中一半数据项比中间值大，一半数据项比中间小值。)*/
	public long median()
	{
		return a[(nElems-1)/2];
	}
	
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
		int len=nElems;
		for(int i=0;i<nElems;i++)//求没有重复数组的长度
		{
			for(int j=i+1;j<nElems;j++)
			{
				if(a[i]==a[j])
				{
					len--;
					remove(j);//删除后面相同相同的元素
				}
			}
		}
	}
	
	public void oddEvenSort()
	{
		//得到a[]
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
		}//此方法不行，奇数有序，偶数有序，不代表所有有序
		this.bubbleSort();
	}
	
}
