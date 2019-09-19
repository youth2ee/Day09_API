package com.naver.lang.ex2;

import java.util.Scanner;

public class CharAtTest1 {

	public void t2() {
		//a->c
		//b->d
		//aaabbb -> cccddd

		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String str = sc.next();

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int num = ch+2;
			ch = (char)num;
			System.out.print(ch);
		}
	}

	public void t1() {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str.length();

		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			System.out.println(a);
		}
	}

}
