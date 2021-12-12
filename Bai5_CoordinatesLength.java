//bài 5: Viết chương trình nhập vào tọa độ A(x1, y1) và B(x2, y2) trên hệ trục toạ độ Oxy.
//Tính và in ra độ dài đoạn thẳng AB.
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai5_CoordinatesLength {

	public static void main(String[] args) {
		double x1A, y1A, x2B, y2B;
		double lengthAB;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập tọa độ điểm A: \n x1: ");
		x1A = input.nextDouble();
		System.out.print(" y1: ");
		y1A = input.nextDouble();
		System.out.print("Nhập tọa độ điểm B: \n x2: ");
		x2B = input.nextDouble();
		System.out.print(" y2: ");
		y2B = input.nextDouble();
		
		lengthAB = Math.sqrt((Math.pow((x2B-x1A),2)) + Math.pow((y2B-y1A),2));
		
		System.out.print("Chiều dài AB là: "+ lengthAB);
		
	}

}

