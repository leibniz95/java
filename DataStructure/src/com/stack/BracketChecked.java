package com.stack;

public class BracketChecked {
	private String input;
	public BracketChecked(String in)
	{input=in;}
	public void check()
	{
		int stacksize=input.length();
		StackX theStack=new StackX(stacksize);
		
		for(int j=0;j<input.length();j++)
		{
			char ch=input.charAt(j);
			switch(ch)
			{
			case'{':
			case'[':
			case'(':theStack.push(ch);break;
			case '}':
			case ']':
			case ')':
				if(!theStack.isEmpty())
				{
					char chx=(char) theStack.pop();
					if((ch=='}'&&chx!='{')||(ch==']'&&chx!='[')||(ch==')'&&chx!='('))
						System.out.println("error:"+ch+" at "+j);
				}
				else
					System.out.println("error:"+ch+" at "+j);
				break;
				
			}
		}
		if(!theStack.isEmpty())
			System.out.println("error:miss right delimiter");
	}
}
