package practice06_Cart;

public class Pizza extends Product{

	//new Pizza (2, "고구마피자", 3000)
	public Pizza(int prodNum, String prodName, int prodprice) {
		super(prodNum, prodName, prodprice);
		prodNum = 2;
		prodName = "고구마피자";
		prodprice = 3000;
	}

}
