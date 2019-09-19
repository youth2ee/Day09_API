package com.naver.lang;

public class Member {
	
	int age;
	int num;
	
	{//인스턴스 초기화 블럭/생성자보다 먼저 호출된다.
	}
	
	static {
	//static 초기화 블럭/실행시 딱 한번 실행된다.
	}
	
	public Member() { //default 생성자
	}
	
	@Override
	public String toString() {
		System.out.println("1 "+this.age);
		System.out.println("2 "+this.num);
		
		return super.toString();
	}
	

	
	@Override
	/*
	public boolean equals(Object obj) { 
		boolean check = this==obj; //this가 m1 obj가 m2 
		
		return check;
	} // m1.equals(m2);
	*/
	
	public boolean equals(Object obj) { 
		
		boolean check = true;
		//m1.age 출력
		//this.age;
		
		System.out.println(this.age);
		
		//m2.age 출력
		//((Member)obj).age;
		
		Member m = (Member)obj;
		
		System.out.println(m.age);
		//object클래스는 본인이 선언한 것에만 접근가능
		//age는 선언한 member클래스에서 선언가능
		
		check = this.age==m.age && this.num==m.num;
		//check = this.age==((Member)obj).age && this.num==((Member)obj).num;
		
		return check;
	} // m1.equals(m2);
	
	

}
