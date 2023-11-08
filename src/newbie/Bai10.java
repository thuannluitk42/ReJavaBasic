package newbie;

import java.util.Scanner;

public class Bai10 {

	public void hienThiThuTuongUng() {
		int number;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào 1 số bất kỳ: ");
		number = scanner.nextInt();

		switch (number) {
		case 1:
			System.out.println("Chủ nhật");
			break;
		case 2:
			System.out.println("Thứ 2");
			break;
		case 3:
			System.out.println("Thứ 3");
			break;
		case 4:
			System.out.println("Thứ 4");
			break;
		case 5:
			System.out.println("Thứ 5");
			break;
		case 6:
			System.out.println("Thứ 6");
			break;
		case 7:
			System.out.println("Thứ 7");
			break;
		default:
			System.out.println("Nhập số không hợp lệ");
		}
	}

	public void phanBietNguyenAmPhuAm() {
		String str;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào ký tự bất kỳ");
		str = scanner.nextLine();

		switch (str) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("ký tự vừa nhập là nguyên âm");
			break;
		default:
			System.out.println("ký tự vừa nhập không phải nguyên âm");
		}
	}

	public String xacDinhCanCuaNamAmLich(int yearNumber) {
		int phanDu = yearNumber % 10;
		String can = "";
		switch (phanDu) {
		case 0:
			can = "Canh";
			break;
		case 1:
			can = "Tân";
			break;
		case 2:
			can = "Nhâm";
			break;
		case 3:
			can = "Qúy";
			break;
		case 4:
			can = "Giap";
			break;
		case 5:
			can = "Ất";
			break;
		case 6:
			can = "Bính";
			break;
		case 7:
			can = "Đinh";
			break;
		case 8:
			can = "Mậu";
			break;
		case 9:
			can = "Kỷ";
			break;
		}
		return can;
	}

	public String xacDinhChiCuaNamAmLich(int yearNumber) {
		int phanDu = yearNumber % 12;
		String chi = "";
		switch (phanDu) {
		case 0:
			chi = "Thân";
			break;
		case 1:
			chi = "Dậu";
			break;
		case 2:
			chi = "Tuất";
			break;
		case 3:
			chi = "Hợi";
			break;
		case 4:
			chi = "Tý";
			break;
		case 5:
			chi = "Sửu";
			break;
		case 6:
			chi = "Dần";
			break;
		case 7:
			chi = "Mão";
			break;
		case 8:
			chi = "Thìn";
			break;
		case 9:
			chi = "Tỵ";
			break;
		case 10:
			chi = "Ngọ";
			break;
		case 11:
			chi = "Mùi";
			break;
		}
		return chi;
	}

	public void xacDinhCanChiQuaNamDuongLich() {
		System.out.println("Nhap nam bat ky: ");
		Scanner sc = new Scanner(System.in);
		int numberYear = sc.nextInt();
		String can = xacDinhCanCuaNamAmLich(numberYear);
		String chi = xacDinhChiCuaNamAmLich(numberYear);
		System.out.println("Can chi cua nam " + numberYear + " la: " + can + " " + chi);

	}

	public static void main(String[] args) {
		Bai10 b10 = new Bai10();
		// b10.hienThiThuTuongUng();
		// b10.phanBietNguyenAmPhuAm();
		b10.xacDinhCanChiQuaNamDuongLich();
	}
}
