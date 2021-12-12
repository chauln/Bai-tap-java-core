/*Viết chương trình cho phép nhập vào số tự nhiên n, in ra tổng các số nguyên tố từ 1 đến n */
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai10_PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int sum = 0;
		
		System.out.print("Nhập số tự nhiên n>=2: ");
		n = Integer.parseInt(input.nextLine());
		System.out.print("Các số nguyên tố: ");
		
		for(int i=1;i<=n;i++) {
			if (soNguyenTo(i) == true) {
				System.out.print(i + ", ");
				sum = sum + i;
			}
		}
		System.out.print("\nTổng các số nguyên tố từ 1 đến " + n + " là: ");
		System.out.print(sum);
		
	}
	public static boolean soNguyenTo(int n) {
		boolean isChecked = true;
		if(n<2) {
			return false;
		}
		// vẫn chưa hiểu tại sao lại là i<=n/2 mà không phải là i<=n ==>> vì nếu i<=n thì kết quả lại không ra gì cả: Xin mentor giải thích giúp
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				isChecked = false;
				return isChecked;
			}
			/* =>> phần else này thêm vào sao lại không ra kết quả đúng ? theo logic thì đúng chứ nhỉ. Xin mentor giải thích giúp. thanks
			else {
				return true;
			
			}
			*/
		}
		return isChecked;
		
	}
	

}
