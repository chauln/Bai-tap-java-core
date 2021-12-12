/*Viết chương trình cho phép nhập vào một chuỗi:
a) In ra độ dài của chuỗi
b) In ra ký tự (char) tại một vị trí nhất định (index)
c) Kiểm tra xem, trong chuỗi vừa nhập có chuỗi phụ "abcdef" hay không
*/
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai15_XuLyChuoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String st;
		
		System.out.print("Nhập 1 chuỗi: ");
		st = input.nextLine();
		
		System.out.print("Độ dài của chuỗi: " + st.length());
		System.out.print("\nVị trí ký tự: ");
		int n = Integer.parseInt(input.nextLine());
		System.out.println("Ký tự tại vị trí " + n + " là: " + st.charAt(n));
		System.out.println("Chuỗi vừa nhập có hay không chuỗi abcdef: " + st.contains("abcdef"));
	}

}
