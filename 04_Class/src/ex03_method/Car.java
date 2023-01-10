package ex03_method;

public class Car {

	// 필드
	int oilPot;
	int carSpeed;
	
	// 기름넣기 메소드
	
	void addOil2(int oil) {
		if(oilPot + oil > 50) {
			oilPot = 50;
			return; // 메소드를 종료하시오. 반환타입이 void일 때에만 사용이 가능함.
		}
		oilPot += oil;
	}
	
	// 달리기 메소드
	void pushAccel() {
		if(oilPot == 0) {
			return;
		}
		oilPot--;

		if(carSpeed + 10 > 100) {
			carSpeed = 100;
			return;
		}
		carSpeed += 10;
		
	}
	
	//멈추기 메소드
	void pushBrake() {
		if(carSpeed == 0) {
			return;
		}
		carSpeed -= 10;
		if(carSpeed < 0) {
			carSpeed = 0;
		}
	}
	
	
	
}
