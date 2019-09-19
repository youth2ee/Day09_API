package com.naver.lang;

public class StringTest4 {

	public static void main(String[] args) {
		
		String s1 ="iu"; //heap 영역의 상수구역이 생기고 거기에 만든다.
		String s2 ="iu"; 
		//위의 s1과 따로 s2를 만드는게 아니라 , s2도 s1의 상수iu를 그냥 갖다씀
		String s3 = new String("iu"); //heap에 공간 새로만들어 주소를 s3에 담는다.
		String s4 = new String("iu"); //heap에 공간 새로만들어 주소를 s4에 담는다.
		
		System.out.println(s1==s2); //true (참조변수(주소)를 비교)
		
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4)); //true (문자열자체를 비교)
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true
		
		//문자열비교
		// == : 참조변수(주소)를 비교
		//equals : 문자열비교
		
		String str1 = new String("iu"); //heap에 iu공간만들어 str1에 주소담음
		str1=str1+"pooh"; //새로pooh객체만들어짐. 더하면서 iupooh객체 또새로 만들어짐. 그 주소를 str1에 넣음
		System.out.println(str1);
		
		String str2 = "abCd";//heap에 공간 새로만들어 주소를 str2에 담는다.
		String str3 = str2.toUpperCase();//heap에 공간 새로만들어 주소를 str3에 담는다.
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		
	}

}
