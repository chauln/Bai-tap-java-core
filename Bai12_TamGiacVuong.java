//Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác vuông có độ dài tương ứng
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai12_TamGiacVuong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Nhập số tự nhiên n (1-9): ");
		n = Integer.parseInt(input.nextLine());
		
		for(int i=1;i<=n;++i) {
			for(int y=1;y<=i;++y) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
