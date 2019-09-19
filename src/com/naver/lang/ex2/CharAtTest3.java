package com.naver.lang.ex2;

import java.util.Scanner;

public class CharAtTest3 {

	public void t4() {
		//파일명 입력 확장자를
		//이미지파일이 아니라면 
		//이미지 파일 : jpg gif jpeg png
		//나머지 파일은 "이미지파일이 아닙니다."

		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String str = sc.next();
		
		int num = str.lastIndexOf('.');
		String beh = str.substring(num+1);
	
		if (beh.equals("jpg") || beh.equals("jpeg") || beh.equals("gif") || beh.equals("png")) {
			System.out.println("이미지파일입니다.");
		} else { 
			System.out.println("이미지파일이 아닙니다.");
		}
		

	}

	public int t3() {
		//소문자 l이 몇개있는지 찾아보기 출력
		//indexof를 이용

		String str = "Hello Java World Company Low legacy";
		int count=0; //찾은 l의 개수
		int index=0; //해당문자를 찾은 위치
		boolean check=true;

		int i=0;

		while(check) {
			index = str.indexOf('l',index);
			if(index == -1) {
				break;
			} 
			index++;	
			count++;

		}
		return count;


		/*
		for(int i=0;i<str.length();i++) {
			index = str.indexOf("l", i);

			if(index==i) {
				count++;
			}
		}
		return count;
		 */
	}

}
