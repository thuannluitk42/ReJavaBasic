package newbie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
	// private Integer x1, x2, x3;
	private static List<Integer> mangSo = new ArrayList<>();

	public void nhap3SoNguyen() {
		System.out.println("Nhap 3 so nguyen");
		System.out.println("Nhap x1: ");
		Scanner scanner = new Scanner(System.in);
		mangSo.add(scanner.nextInt());
		System.out.println("Nhap x2: ");
		mangSo.add(scanner.nextInt());
		System.out.println("Nhap x3: ");
		mangSo.add(scanner.nextInt());
	}

	public static int soLonNhatTrongMang() {
		Integer rs = mangSo.get(0);
		for (int i = 0; i < mangSo.size(); i++) {
			if (mangSo.get(i) > rs) {
				rs = mangSo.get(i);
			}
		}
		return rs;
	}

	public static int soNhoNhatTrongMang() {
		Integer rs = mangSo.get(0);
		for (int i = 0; i < mangSo.size(); i++) {
			if (mangSo.get(i) < rs) {
				rs = mangSo.get(i);
			}
		}
		return rs;
	}

	// Chuyển đổi 3 số đó thành số nhị phân, thập lục phân, bát phân và hiển thị ra
	// màn hình.
	// chua implement
	public static int tongCacSoTrongMang() {
		Integer rs = 0;
		for (int i = 0; i < mangSo.size(); i++) {
			rs += mangSo.get(i);
		}
		return rs;
	}

	public void inKetQua() {
		System.out.println("Số lớn nhất trong 3 số đó: " + soLonNhatTrongMang());
		System.out.println("Số nhỏ nhất trong 3 số đó: " + soNhoNhatTrongMang());
		System.out.println("Chuyển đổi 3 số đó thành số nhị phân, thập lục phân, bát phân và hiển thị ra màn hình: ");
		System.out.println("Hiển thị tổng của 3 số vừa nhập: " + tongCacSoTrongMang());
	}

	public static void main(String[] args) {
		Bai2 b2 = new Bai2();
		b2.nhap3SoNguyen();
		b2.inKetQua();
	}

}
