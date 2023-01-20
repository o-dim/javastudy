package parking;

import java.util.Scanner;

public class ParkingLot {
	private String name;
	private int idx;
	private Car[] cars;
	Scanner sc;

	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		
		System.out.println("현재 등록된 차량 " + idx + "대");
		if (idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.println("차량 번호 >>> ");
		String carNo = sc.next();
		System.out.println("모델명 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		cars[idx++] = car;
		System.out.println("차량 번호 " + carNo + "차량이 등록되었습니다.");
	}
	
	public void deleteCar() {
		if (idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		System.out.println("삭제할 차량 번호를 입력하세요 >>> ");
		String carNo = sc.next();
		
		for (int i = 0; i < idx; i ++) {
			if(cars[i].getCarNo().equals(carNo)){
				System.out.println("차량번호 " + carNo + "차량이 삭제되었습니다.");
				cars[i] = cars[--idx];
				break;
			}
		}
		System.out.println("대상 차량이 존재하지 않습니다."); // 전부 다 훑어봐야해서 이건 뒤에 넣어줘야함

		
		
	}
	
	public void printAllCars() {
		if (idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		System.out.println(name);
		for (int i = 0; i < idx; i++) {
			System.out.println(cars[i]);
		}
	}
	
	public void manage() {
		while(true) {
			System.out.println("1.추가 2.삭제 3.전체 0.종료");
			String num = sc.next();
			
			switch(num) {
			case "1" : 
				addCar();
				break;
			case "2" :
				deleteCar();
				break;
			case "3" :
				printAllCars();
				break;
			case "0" :
				return;
			default :
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
	
}


