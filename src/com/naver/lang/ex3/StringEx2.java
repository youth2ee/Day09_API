package com.naver.lang.ex3;

public class StringEx2 {

	public static void main(String[] args) {
		
		CarMaker carmaker = new CarMaker();
		//Car car = carmaker.makecar(); //carinfo가 kia,k7,black일떄
		Car[] car = carmaker.makecars();
		
		
		CarView carview = new CarView();
		carview.view(car); //view 메서드오버로딩
		

	}

}
