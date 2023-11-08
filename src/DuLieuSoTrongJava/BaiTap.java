package DuLieuSoTrongJava;

import java.util.Scanner;

public class BaiTap {
	// Viết chương trình giải phương trình bậc 2 2 ẩn.
	private double x1, x2;

	private boolean checkDieuKienPTB2(double a) {
		if (a != 0) {
			return true;
		} else {
			return false;
		}
	}

	private double tinhDelta(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	private void tinhHaiNghiemPhanBietX1X2(double delta, double a, double b) {
		this.x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Nghiem x1: " + this.x1);
		this.x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Nghiem x2: " + this.x2);
	}

	private void tinhNghiemKep(double delta, double a, double b) {
		this.x1 = -b / (2 * a);
		this.x2 = -b / (2 * a);
		System.out.println("Nghiem x1 = x2 = " + this.x1);
	}

	private void khongCoNghiem() {
		System.out.println("Phuong trinh vo nghiem");
	}

	private void giaiPhuongTrinhBac2(double a, double b, double c) {
		boolean checkPTB2 = checkDieuKienPTB2(a);

		if (checkPTB2) {
			double giaTriDelta = tinhDelta(a, b, c);
			if (giaTriDelta > 0) {
				tinhHaiNghiemPhanBietX1X2(giaTriDelta, a, b);
			} else if (giaTriDelta == 0) {
				tinhNghiemKep(giaTriDelta, a, b);
			} else {
				khongCoNghiem();
			}
		} else {
			System.out.println("Khong phai phuong trinh bac 2. Khong tinh");
		}
	}

	public static void main(String[] args) {
		BaiTap bt = new BaiTap();
		System.out.println("Bat dau giai phuong trinh bac 2");
		Scanner sc = new Scanner(System.in);
		boolean flagContinue = true;
		while (flagContinue) {
			System.out.print("Nhap a: ");
			double a = sc.nextDouble();
			System.out.print("Nhap b: ");
			double b = sc.nextDouble();
			System.out.print("Nhap c: ");
			double c = sc.nextDouble();
			System.out.print("Ket qua la: ");
			bt.giaiPhuongTrinhBac2(a, b, c);
			System.out.print("ket thuc nhap: false, tiep tuc nhap: true ");
			flagContinue = sc.nextBoolean();
		}
		System.out.println("Ket thuc giai phuong trinh bac 2");
	}
}
