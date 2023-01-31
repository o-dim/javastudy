package baek0130;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		while(true) {
			int ten = num / 10;
			int one = num % 10;
			int newNum = (one * 10) + (ten + one) % 10;
			count ++;
			num = newNum;
			if(num == temp) {
				break;
			}
			
		}
		System.out.println(count);
		
		
	}

}
