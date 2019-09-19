package com.naver.lang.ex3;

public class CarView {
	
	//view 메서드오버로딩
	
	public void view(Car car) {
		//자동차 타입을 하나 받아서 모든 정보를 출력
		System.out.println("=================");
		System.out.println("회 사 "+car.getCompany());
		System.out.println("색 깔 "+car.getColor());
		System.out.println("모 델 "+car.getModel());
		
	}
	

	public void view (Car[] car) {
		//자동차 타입 배열을 받아 모든 정보를 출력
		
		for(int i=0;i<car.length;i++) {
			this.view(car[i]);
			
			/*
			System.out.println("=================");
			System.out.println("회 사 "+car[i].getCompany());
			System.out.println("색 깔 "+car[i].getColor());
			System.out.println("모 델 "+car[i].getModel());
			*/
			}
	}

}
