package practice02_Person_Array;

public class Home {
	
	private Person[] arr;
	private int count;
	
	public Home(int count) {
		arr = new Person[count];
		this.count = count;
	}

	public Person[] getArr() {
		return arr;
	}

	public void setArr(Person[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
}
