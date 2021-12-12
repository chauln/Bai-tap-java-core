//bài 6: Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai6_StringReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String stringInput;
		String stringOutput;
		
		System.out.print("Nhập chuỗi: ");
		stringInput = input.nextLine();
		
		stringOutput = new StringBuffer(stringInput).reverse().toString();
		System.out.print("Chuỗi mới là: " + stringOutput);
		
	}

}
