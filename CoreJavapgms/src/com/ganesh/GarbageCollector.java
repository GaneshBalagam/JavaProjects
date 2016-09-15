package com.ganesh;
class A
{
	A()//constructor using
	{
		System.out.println("Object creating");
	}
	public void finalize()
	{
		System.out.println("Object destroying");
	}
}
public class GarbageCollector {

	public static void main(String[] args) {
		A a=new A();
		a=null;
		System.gc();
		
		
	}

}
