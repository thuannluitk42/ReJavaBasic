package newbie;

import java.util.Scanner;

public class Bai3 {

	private String ten, maSoSinhVien, gioiTinh, ngaySinh;

	public Bai3(String ten, String maSoSinhVien, String gioiTinh, String ngaySinh) {
		this.ten = ten;
		this.maSoSinhVien = maSoSinhVien;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
	}

	public Bai3() {

	}

	public void nhapThongTinSinhVien() {
		System.out.println("Nhap ten: ");
		Scanner scanner = new Scanner(System.in);
		this.ten = scanner.nextLine();
		System.out.println("Nhap ma so sinh vien: ");
		this.maSoSinhVien = scanner.nextLine();
		System.out.println("Nhap gioi tinh: Nam: 1, Nu: 0");
		int isMale = scanner.nextInt();
		this.gioiTinh = chuyenDoiGioiTinh(isMale);
		System.out.println("Nhap ngay sinh: ");
		int ngaySinh = scanner.nextInt();
		System.out.println("Nhap thang sinh: ");
		int thangSinh = scanner.nextInt();
		System.out.println("Nhap nam sinh: ");
		int namSinh = scanner.nextInt();
		this.ngaySinh = ngaySinh + "/" + thangSinh + "/" + namSinh;
		// Bai3 b3 = new Bai3(ten, ten, mssv, ngaySinh + "/" + thangSinh + "/" +
		// namSinh);
	}

	private String chuyenDoiGioiTinh(int isMale) {
		// male = 0 , female = 1
		if (isMale == 0) {
			return "Nam";
		} else {
			return "Nu";
		}
	}

	private void hienThiThongTinSinhVien() {
		System.out.println("Ten sinh vien la: " + this.ten);
		System.out.println("Ma so sinh vien la: " + this.maSoSinhVien);
		System.out.println("Gioi tinh la: " + this.gioiTinh);
		System.out.println("Ngay sinh la: " + this.ngaySinh);
	}

	public static void main(String[] args) {
		Bai3 b3 = new Bai3();
		b3.nhapThongTinSinhVien();
		b3.hienThiThongTinSinhVien();
	}
}
