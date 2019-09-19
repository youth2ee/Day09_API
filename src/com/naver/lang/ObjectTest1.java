package com.naver.lang;

public class ObjectTest1 {
	public static void main(String[] args) {
		
		//객체생성 : 클래스명 변수명 = new 클래스명(); = new 생성자;
		Object obj = new Object();
		
		//메서드 선언 공식
		//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
		
		obj.toString(); //tostring타입 : string
		//멤버메서드 호출 : 클래스의 변수명.메서드 명();
		
		String str = obj.toString();
		System.out.println(str); 
		System.out.println(obj);
		//서로 같은 값
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.age =10;
		m1.num=1;
		
		m2.age=25;
		m2.num=1; 
		
		//모든 클래스는 Object타입이다.
		obj.equals(m1); //equals타입 : boolean
		obj.equals(m2); 
		
		boolean check = m1.equals(m2);
		
		System.out.println(check);
		
		
		m1.toString();
		System.out.println(m1);
		
		int num = m1.hashCode(); //hashcode 
		System.out.println(num);
		
		System.out.println(String.CASE_INSENSITIVE_ORDER); //클래스명.변수명
		//final - 상수형변수 (모두 대문자)
		

		
	}

}
