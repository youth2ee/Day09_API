package com.naver.lang.ex1;

import java.util.Scanner;

public class MemberLogin {

	public Member login() {
		//id pw 입력받아서 로그인 성공하면 해당 member를 리턴
		MemberMake mk = new MemberMake();
		Member [] members = mk.getMembers();

		Scanner sc = new Scanner(System.in);
		System.out.println("id입력");
		String id = sc.next();
		System.out.println("pw입력");
		String pw = sc.next();

		Member member=null;

		for(int i=0;i<members.length;i++) {
			if(members[i].getId().equals(id) && members[i].getPw().equals(pw)) {
				member = members[i];
				break;
			}
		}//for
		
		return member;
	}

}
