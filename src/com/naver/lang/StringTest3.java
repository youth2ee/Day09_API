package com.naver.lang;

public class StringTest3 {

	public static void main(String[] args) {
		
		String str1 = " iu";
		String str2 = "iu ";
		String str3 = "i u";
		
		System.out.println(str1.equals(str2));
		//str1과 str2는 다르다.(빈칸도 문자로 인식) -> false
		
		//trim //전처리과정
		str1=str1.trim(); //->"iu"
		str2=str2.trim(); //->"iu"
		System.out.println(str1.equals(str2));
		//str1과 str2는 같다.(trim이 빈칸을 지움) -> true
		//다만 문자가운데의 빈칸은 trim으로 지울수 없다.
		//trim은 앞과 뒤의 빈칸만 지운다.
		//문자열 내의 빈칸을 지우기 위해서는 'replace'를 써야 한다.
		
		//replace로 빈칸지우기
		str3=str3.replace(" ", "");
		System.out.println(str3);
		
		//문자열만들기 valueof
		String n = String.valueOf(true);
		System.out.println(n);
		
		String m = String.valueOf(10);
		System.out.println(m);
		

	}

}
