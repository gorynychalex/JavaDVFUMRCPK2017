package ru.dvfu.mrcpk.ex01Begin;

public class Hello {
	public static void main( String args[] )
	{
		System.out.println("Hello World!");
		System.out.println("My arguments:");
		for (int i = 0; i < args.length; i++)
		{
		   System.out.println(" arg["+i+"] :"+args[i]);
		}
		System.out.println("Good bye!");
	}
}
