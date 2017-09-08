package com.queue;

import org.junit.Test;

public class Main {
	@Test
	public void testPirQue()
	{
		PriorityQ q=new PriorityQ(5);
		q.insert(10);
		q.insert(96);
		q.insert(52);
		q.insert(60);
		q.insert(9);
			
		while(!q.isEmpty())
		{
			System.out.print(q.remove()+"	");
		}
		System.out.println();
	}
	@Test
	public void testQueue()
	{
		Queue q=new Queue(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		
		q.remove();
		q.remove();
		
		while(!q.isEmpty())
		{
			System.out.print(q.remove()+"	");
		}
		System.out.println();
		q.display();
	}
}
