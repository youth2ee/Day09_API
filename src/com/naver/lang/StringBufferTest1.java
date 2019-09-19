package com.naver.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		
		String str1 = "iu"; //객체1
		String str2 = "pooh"; //객체2
		
		str1 = str1+str2; //객체3
		System.out.println(str1);
		
		
		//stringbuffer
		StringBuffer sb = new StringBuffer(); //객체1
		sb.append("iu"); //객체하나에 계속 추가하겠다. 객체1+iu
		sb.append("pooh"); // 위 객체에 더하겠다. 객체1+iu+pooh
		System.out.println(sb);
		
		//tostring
		
		//str1=sb; //에러
		//str1은 데이터타입이 string이고, sb는 데이터타입이 stringbuffer
		
		str1=sb.toString(); //sb의 주소를 직접불러와서 sb에 넣겠다. 이건 가능.
	}

}
