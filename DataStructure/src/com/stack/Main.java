package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class Main {
	@Test
	public void testStackX() throws IOException
	{
		String input,output;
		while(true)
		{
			System.out.println("enter infix:");
			System.out.flush();
			input=getString();
			
			if(input.equals(""))
				break;
			InToPost theTrans=new InToPost(input);
			output=theTrans.doTrans();
			System.out.println("postfix is :"+output);
		}
	}
	public static String getString() throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		
		return s;
	}
	@Test
	public void testBracket()
	{
		BracketChecked bc=new BracketChecked("(((())))");
		bc.check();
	}
	@Test
	public void testStack()
	{
//		StackX theStack=new StackX(10);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80);
//		
//		while(!theStack.isEmpty())
//		{
//			long value=theStack.pop();
//			System.out.print(value+" ");
//		}
	}
}
