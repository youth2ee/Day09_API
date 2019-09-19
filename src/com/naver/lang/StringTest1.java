package com.naver.lang;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) {
		
		String str ="abc";
		
		String str2 = new String("abc"); 
		//원래는 이렇게 만들어야 함
		//string도 하나의 class이므로
		
		System.out.println(str2.toString());
		//Object클래스에서 tostring메서드는 주소를 리턴하는 메서드였는데
		//String클래스에서 오버라이딩됨.
		
		System.out.println(str==str2); //false //문자열은 이렇게 비교하지마 같아도 다를수있다.
		
		//equals
		boolean check = str.equals(str2); //문자열비교는 이제부터 이렇게 한다.
		System.out.println(check);
		
		
		//charAt
		String str3 = "HelloJava";
		char a = str3.charAt(3);
		System.out.println(a);
		
		//indexOf 문자열의 인덱스번호
		int num = str3.indexOf(97);//char 넣어줘야한다. 문자의 아스키코드값 넣어도 나온다.
		System.out.println(num);
		
		num = str3.indexOf("Java"); //Java라는 문자의 시작번호. 대소문자 구분한다.
		System.out.println(num);
		
		//replace
		str = "Hello Java World Company Low legacy";
		str = str.replace('l', 'L');
		System.out.println(str);
		
		str = str.replace("Java", "Game");
		System.out.println(str);
		
		//substring
		String sub = str.substring(6);
		System.out.println(sub);
		
		sub = str.substring(6, 10);
		System.out.println(sub);
		
		
	}

}
