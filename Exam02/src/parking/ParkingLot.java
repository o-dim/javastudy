package parking;

import java.util.Scanner;

public class ParkingLot {
	private String name;
	private Car[] cars;
	private int idx;
	Scanner sc;

	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		if (idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.println("차량 번호 >>> ");
		String carNo = sc.next();
		System.out.println("차 모델 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		cars[idx++] = car;
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
	}
	
	public void deleteCar() {
		
	}
	public void printAllCars() {
		
	}
	public void manage() {
		while(true) {
			System.out.println("1.추가 2.삭제 3.목록확인 0.종료 >>> ");
			String choice = sc.next();
			
			switch(choice) {
			case "1" :
				addCar();
				break;
			case "2":
				deleteCar();
				break;
			case "3":
				printAllCars();
			case "0":
				System.out.println("프로그램이 종료됩니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
					
			}
		}
		
	}
	
}
