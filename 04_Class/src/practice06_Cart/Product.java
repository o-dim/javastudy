package practice06_Cart;

public class Product {
	
	// 제품 번호, 제품 이름, 가격 
	private int prodNum;
	private String prodName;
	private int prodprice;
	
	public Product(int prodNum, String prodName, int prodprice) {
		super();
		this.prodNum = prodNum;
		this.prodName = prodName;
		this.prodprice = prodprice;
	}

	public int getProdNum() {
		return prodNum;
	}

	public void setProdNum(int prodNum) {
		this.prodNum = prodNum;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdprice() {
		return prodprice;
	}

	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}

	
}
