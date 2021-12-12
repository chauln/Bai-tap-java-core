//bài 4: nhập số tự nhiên và in ra tổng các số đó
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai4_IntegerCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
		int quantity;
				
		System.out.print("Bạn muốn nhập bao nhiêu số: ");
		quantity = input.nextInt();
			for(int i=1; i<=quantity; i++) {
				System.out.print("Số tự nhiên thứ " + i + ": ");
				number = input.nextInt();
				sum = sum + number;
			}
		System.out.print("Tổng các số là: " + sum);
		

	}

}
