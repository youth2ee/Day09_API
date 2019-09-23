package com.naver.lang2;

import java.util.Scanner;

public class WeapperTest2 {

	public static void main(String[] args) {
		//회원가입상황
		//비밀번호를 스캐너를 통해 입력받는다.
		//규정을 만든다. 
		//최소 8글자 이상
		//대문자 2개이상, 소문자 2개이상, 숫자는 1개이상 포함
		//공백은 없어야 한다.
		

		int m1=0;
		int m2=0;
		int m3=0;
		int m4=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 만듭시다");
		String pw = sc.nextLine(); //공백받으려면 line까지 받아라
		

		for(int i=0;i<pw.length();i++) {
			
			if(pw.length()<=8) {
				char a = pw.charAt(i);

				if(Character.isUpperCase(a)) {
					m1++;
				} else if (Character.isLowerCase(a)) {
					m2++;
				} else if (Character.isDigit(a)) {
					m3++;
				} else if (Character.isWhitespace(a)) {
					m4++;
				}  
			}else {
				System.out.println("8자를 입력하세요");
				break;
			}
		} //for
		
		if(m1>=2 && m2>=2 && m3>=1 && m4<=0) {
			System.out.println("비밀번호 완성");
		} else {
			System.out.println("비밀번호 생성 실패");
		}
		
		System.out.println("대문자개수 : "+m1);
		System.out.println("소문자개수 : "+m2);
		System.out.println("숫자   개수 : "+m3);
		System.out.println("빈칸   개수 : "+m4);
		
		System.out.println("add print");
		System.out.println("play");
		System.out.println("good");
		

	}

}
