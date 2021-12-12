//Viết chương trình cho phép nhập vào số tự nhiên n, in ra số tự nhiên lớn nhất nhỏ hơn log2 (n).
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai11_logarit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double log2n;
		
		System.out.print("Nhập số tự nhiên n: ");
		n = Integer.parseInt(input.nextLine());
		log2n = (double)( Math.log(n)/ Math.log(2));
		
		System.out.print("Số tự nhiên nhỏ lơn log2(n) là: " + (int)log2n);

	}

}
