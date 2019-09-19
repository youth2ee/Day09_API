package com.naver.lang2;

import java.util.concurrent.atomic.LongAccumulator;

public class WrapperTest1 {

	public static void main(String[] args) {
		
		int num=10;
		//primitive type -> reference type
		
		System.out.println(Integer.BYTES);
		//int는 몇바이트니
		System.out.println(Long.BYTES);
		//long은 몇바이트니
		
		System.out.println(Integer.MAX_VALUE);
		//int가 담을 수 있는 최대 바이트값
		System.out.println(Integer.MIN_VALUE);
		//int가 담을 수 있는 최소 바이트값
		
		System.out.println(Integer.SIZE);
		//int는 몇비트니 4바이트 1바이트는 8비트 =32비트
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Integer integer = new Integer(10); //primitive
		Integer integer2 = new Integer("10"); //reference 숫자형문자만 가능
		//integer = new Integer("그냥문자는 못온다."); //에러
		
		int n1 = integer.intValue(); //10을 10으로
		int n2 = integer2.intValue();//string "10"을 int 10로 바꿔준다.
		System.out.println(n1+n2);
		
		n1 = integer; //됨 허용 : r타입을 p타입으로 푼다. UnBoxing 여기서는 자동으로 하므로 Auto unboxing
		integer = n1; //됨 허용 : p타입을 r타입으로 감싼다. Boxing 여기서는 자동으로 하므로 Auto boxing이라 한다.
		
		double a = 3.14;
		//integer = a; //에러 데이터타입다르므로
		Double b = a; //같은 데이터타입만 auto boxing과 auto unboxing 가능
		
		
		//parseInt
		int n= integer.parseInt("10");
		System.out.println(n);
		
		//parseDouble
		String s = "2.56";
		double ab = Double.parseDouble(s);
		
		char st = ' ';
		boolean m = Character.isWhitespace(st);
		System.out.println(m);
		

	}

}
