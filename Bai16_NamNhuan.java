//Viết chương trình kiểm tra xem năm nhập vào có phải năm nhuận hay không?
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai16_NamNhuan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nam;
		System.out.print("Nhập năm: ");
		nam = Integer.parseInt(input.nextLine());
		
		
		if((nam%4 == 0 && nam%100 != 0) || nam%400 == 0) {
			System.out.println("Đây là năm nhuận");
		}
		else
			System.out.println("Đây không phải năm nhuận");
	}

}
