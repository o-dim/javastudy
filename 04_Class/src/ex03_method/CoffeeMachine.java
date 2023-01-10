package ex03_method;

public class CoffeeMachine {
	
	//필드
	int moneyPot;
	String[] menu = {"아메리카노", "카페라떼", "마끼야또"};
	int[] prices = {900, 1500, 2000};
	
	
	//메소드
	CoffeeAndChange buyCoffee(int money, int choice){
		
		
		String coffee = menu[choice - 1];
		int price = prices[choice - 1];
		//돈이 모자르면
		if(money < price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
		}
		
		
		moneyPot += price;
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee;
		cnc.change = money - price;
		
		return cnc;
	}
}
