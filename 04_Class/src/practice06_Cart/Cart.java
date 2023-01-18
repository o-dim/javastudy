package practice06_Cart;

public class Cart {
	
	private Product[] products;
	private int prodCount; // 실제 products 배열에 저장된 product의 개수 
	
	// new cart (10)
	// new cart (20)
	
	public Cart (int cartSize) {
		products = new Product[cartSize]; // 배열 생성~ 
		prodCount = 0;	
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getProdCount() {
		return prodCount;
	}

	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}
	
	//카트에서 물건 담기 
	//addProduct(new Meat ( 1, "소고기" 5000))
	public void addProduct (Product product) {
		
		//카트가 가득 차면 물건을 담지 못한다
		if (products.length == this.prodCount) {
			System.out.println("카트가 가득 찼습니다.");
			return;
		}
		
		//카트에 물건담기 / 사용하고 하나 늘리기 (뒤에 + 달기)
		products[prodCount++] = product;

	}

	//카트에서 물건 빼기 
	public void deleteProduct(int prodNum) {
		// 카트가 비어져있는면 뺄 물건이 없다
		if (prodCount == 0) {
			System.out.println("카트가 비어있습니다.");
			return;
		}
		// 카트에서 물건빼기
		for (int i = 0 ; i < prodCount ; i++) {
			if (products[i].getProdNum() == prodNum) {
				products[i] = products[--prodCount]; // 마지막 물건을 뺀 물건 자리로 옮기기
				break;
			}
		}
		
	}
	
}
