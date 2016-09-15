package com.ganesh;

import java.util.StringTokenizer;

public class StringManipulations {

    public String toString()
    {
		return null;
    	
    }
	
	public static void main(String[] args) {
		String str10=new String("abc");
		String str11=new String("ABC");
		System.out.println(str10.equalsIgnoreCase(str10));
		int i=10;
		int j=20;
		StringManipulations a1=new StringManipulations();
		StringManipulations a2=new StringManipulations();
		String str8=new String("abc");
		String str9=new String("abc");
		System.out.println(i==j);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(str8=str9);
		System.out.println(str8.equals(str9));// it will compare the content data only
		
		
		String str7="durga".concat(" Software").concat(" Solutions");
		System.out.println(str7);
		String str4=new String("durga");
		String str5=str4.concat(" software");
		String str6=str5.concat(" solutions");
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		char[] ch={'a','g','c','g'};
		String str3=new String(ch);
		System.out.println(str3);
		byte[] b={65,66,67,68,69};
//		String str2=new String(b);
		String str2=new String(b,2,2);
		System.out.println(str2);
		StringManipulations a=new StringManipulations();
		System.out.println(a);
		String str1=new String("abc");
		System.out.println(str1);
	String str="balagam bhavani ganesh";
	System.out.println("length of the string :"+str.length());
	//StringTokenizer st=new StringTokenizer(str);
	StringTokenizer st=new StringTokenizer(str,"b");
	System.out.println("No of Tokens:"+st.countTokens());
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}

	}

}
