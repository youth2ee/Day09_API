package com.naver.lang.ex1;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberLogin ml = new MemberLogin();
		Member member = ml.login();
		
		//출력 로그인성공실패여부
		if(member != null) {
			System.out.println("로그인성공");
			System.out.println(member.getId()+"님 환영");
		}else {
			System.out.println("로그인실패");
		}

	}

}
