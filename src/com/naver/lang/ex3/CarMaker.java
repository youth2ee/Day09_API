package com.naver.lang.ex3;

public class CarMaker {

	private String carInfo;

	public CarMaker() { //생성자

		carInfo ="kia,k7,black,Audi,q7,red,Benz,S300,white,BMW,Eclass,pink";
		//csv
		//문자열 자르기 : 파싱
	}

	public Car[] makecars() { //여러개받기
		String [] result2 = this.carInfo.split(",");
		Car[] cars = new Car[result2.length/3];
		//result2.length =12

		//int idx=0;
		for(int i=0;i<result2.length;i++) {

			Car car = new Car();
			car.setCompany(result2[i]);
			//i++을 중간에 수식으로 따로 넣고
			//car.setModel(result2[i]); 이렇게 해도됨
			car.setModel(result2[++i]); 
			//i+1은 값이 누적이 안되므로 안됨. i=i+1은 값이 누적되므로 가능하다.
			//++i와 i=i+1은 같다.
			car.setColor(result2[++i]);
			
			//i++ : 나중에 연산자
			//++i : 연산자먼저

			cars[i/3] = car;
			//cars[idx]=car;
			//idx++;
		}
		return cars;
	}

	
	/* 하나받기
	public Car makecar() {
		String [] result = this.carInfo.split(",");
		Car car = new Car();
		car.setCompany(result[0]);
		car.setModel(result[1]);
		car.setColor(result[2]);

		return car;
	}
	*/
	 

}
