//bài 7: Viết chương trình cho phép nhập vào một số tự nhiên và in ra các ước số của số tự nhiên đó.
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai7_DivisorInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aNumber;
		
		System.out.print("Nhập số tự nhiên: ");
		aNumber = Integer.parseInt(input.nextLine());
		
		System.out.print("Ước số của " + aNumber + " là: ");
		for(int i=1; i<=aNumber; i++) {
			if(aNumber % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
