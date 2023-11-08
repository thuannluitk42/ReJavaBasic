package newbie;

import java.util.Scanner;

public class Bai4 {
//Viết chương trình tính tổng các chữ số của 1 số nguyên bất kỳ
	public static int tinhTongCacSoCuaMotSoNguyen(int soNguyen) {
		String strNumber = String.valueOf(soNguyen);
		char[] arrNumber = strNumber.trim().toCharArray();
		int rs = 0;
		for (char number : arrNumber) {
			String cvt = String.valueOf(number);
			rs += Integer.valueOf(cvt);
		}
		return rs;
	}

	public static void main(String[] args) {
		System.out.println("Nhap so nguyen:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Tong cac chu so cua so nguyen la: " + tinhTongCacSoCuaMotSoNguyen(number));
	}
}
