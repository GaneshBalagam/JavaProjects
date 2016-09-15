package com.ganesh;
 class B
{
	static//static blocks executed at the time of byte code loading
	{
		System.out.println("class loading");
		
	}
	B() //constructers are executed after byte code load into the memory
	{
		System.out.println("object creating");
	}
}

public class Static {

	public static void main(String[] args)
	{

		B b=new B();
		
	}

}
