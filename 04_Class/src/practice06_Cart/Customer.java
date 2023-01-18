package practice06_Cart;

public class Customer {
	private int myMoney;
	private int myPoint;
	private Cart myCart;
	
	public Customer(int myMoney, int myPoint) {
		super();
		this.myMoney = myMoney;
		this.myPoint = myPoint;
		this.myCart = new Cart(10);
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}

	public Cart getMyCart() {
		return myCart;
	}

	public void setMyCart(Cart myCart) {
		this.myCart = myCart;
	}
	
	// 카트에 물건 넣기
	public void addToCart (Product product) {
		myCart.addProduct(product);
		
	}
	
	// 카트에 물건 빼기
	public void deleteFromCart (int prodNum) {
		myCart.deleteProduct(prodNum);
	}
	
	// 카트에 물건을 다 담음.. 구매하기
	// 구매하면 영수증을 string 형태로 반환 
	public String buy () {
		int buyMoney = 0; // 구매한 물건들의 가격 합계
		int buyPoint = 0; // 구매한 물건들의 가격에 의한 포인트 합계
		String reciept = "-----영수증-----\n";
		
		for (int i = 0 ; i < myCart.getProdCount(); i++) {
			//구매가 불가능한 경우 돈이 부족해!
			
			Product product = myCart.getProducts()[i];
			buyMoney += product.getProdprice();
			buyPoint += product.getProdprice() * 0.05;
			reciept += product.getProdName() + "   " + product.getProdprice() + "원\n";
			
			if (myMoney <= buyMoney) {
				System.out.println("돈이 부족해요. 구매를 종료합니다.");
				return ""; // return null; 도 가능 
			}
			
		}
		
		myPoint += buyPoint;
		myMoney -= buyMoney;
		
		reciept += "------------------\n";
		reciept += "발생한 포인트 " + buyPoint + "점\n";
		reciept += "보유 포인트 " + myPoint + "점\n";
		reciept += "구매 총액 " + buyMoney + "원\n";
		return reciept;
		
		
		
	}
	
}

