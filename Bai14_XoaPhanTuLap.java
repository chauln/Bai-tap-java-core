//Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng. Xóa đi các phần tử bị lặp lại
package cybersoft.java16.buoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai14_XoaPhanTuLap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> arrTemp = new ArrayList<Double>();
		
		int n;
		double giaTri;
		System.out.print("Nhập số phần tử của mảng: ");
		n=Integer.parseInt(input.nextLine());
		for(int i=0;i<n;i++) {
			System.out.print("Giá trị phần tử thứ " + i + " là: ");
			giaTri = Double.parseDouble(input.nextLine());
			arr.add(giaTri);
		}
		System.out.print("Mảng mới nhập là: " + arr);
		
		for(int i=0;i<arr.size();i++) {
			if(!arrTemp.contains(arr.get(i))) {
				arrTemp.add(arr.get(i));
			}
		}
		
		System.out.println("\nMảng mới là: " + arrTemp);
	}

}
