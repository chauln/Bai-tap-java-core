package cybersoft.java16.buoi1;

public class Bai18_TietKiem {

	public static void main(String[] args) {
		double soTienBanDau = 550000000;
		double soTienMuonCo = 1200000000;
		double laiSuat = 0.1; //10% 1 năm
		int soNam;
		
		soNam = (int) ((soTienMuonCo - soTienBanDau)/(soTienBanDau*laiSuat));
		
		System.out.println("Số năm tối thiểu phải chờ: " + soNam + " năm");
	}

}
