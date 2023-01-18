package practice06_Cart;

public class Meat extends Product{

	public Meat(int prodNum, String prodName, int prodprice) {
		super(prodNum, prodName, prodprice);
		prodNum = 1;
		prodName = "고기";
		prodprice = 5000;
	}

}

