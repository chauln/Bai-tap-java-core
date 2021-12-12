// Viết chương trình cho phép nhập vào một chuỗi viết thường, in ra chuỗi trên với
//các ký tự đầu tiên được viết in hoa.
package cybersoft.java16.buoi1;

import java.util.Scanner;

public class Bai8_UpperLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String chuoiVietThuong = "";
			
		System.out.print("Chuỗi ban đầu: ");
		chuoiVietThuong = input.nextLine();
		String[] tuDonLe = chuoiVietThuong.split("\s"); //tách chuỗi dựa trên khoảng trắng
		String kyTuDauThuong;
		String kyTuDauHoa;
		String kyTuConLaiThuong;
		String tuVietHoa;
		
		System.out.print("Chuỗi mới là: ");
		for(String tu:tuDonLe) {
			kyTuDauThuong = tu.substring(0, 1);
			kyTuConLaiThuong = tu.substring(1, tu.length());
			kyTuDauHoa = kyTuDauThuong.toUpperCase();
			tuVietHoa = kyTuDauHoa + kyTuConLaiThuong;
			System.out.print(tuVietHoa+" ");
			
		}

	}

}
