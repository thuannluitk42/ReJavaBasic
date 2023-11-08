package newbie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai9 {
//Java - Tính và hiển thị chu vi của một tam giác thường.
	public int x, y;
	public static List<Bai9> arrPoint = new ArrayList<>();

	public Bai9(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Bai9() {
	}

	public void nhapThongTinDiem() {
		System.out.println("Nhap toa do diem A");
		System.out.print("Nhap Ax: ");
		Scanner scanner = new Scanner(System.in);
		int Ax = scanner.nextInt();
		System.out.print("Nhap Ay: ");
		int Ay = scanner.nextInt();
		System.out.println("Diem A co toa do la: A(" + Ax + " , " + Ay + ")");
		Bai9 diemA = new Bai9(Ax, Ay);
		arrPoint.add(diemA);

		System.out.println("Nhap toa do diem B");
		System.out.print("Nhap Bx: ");
		int Bx = scanner.nextInt();
		System.out.print("Nhap By: ");
		int By = scanner.nextInt();
		System.out.println("Diem B co toa do la: B(" + Bx + " , " + By + ")");
		Bai9 diemB = new Bai9(Bx, By);
		arrPoint.add(diemB);

		System.out.println("Nhap toa do diem C");
		System.out.print("Nhap Cx: ");
		int Cx = scanner.nextInt();
		System.out.print("Nhap Cy: ");
		int Cy = scanner.nextInt();
		System.out.println("Diem C co toa do la: C(" + Cx + " , " + Cy + ")");
		Bai9 diemC = new Bai9(Cx, Cy);
		arrPoint.add(diemC);
	}

	public double tinhDoDaiGiua2Diem(Bai9 toaDoA, Bai9 toaDoO) {
		return Math.sqrt(Math.pow((toaDoA.x - toaDoO.x), 2) + Math.pow((toaDoA.y - toaDoO.y), 2));
	}

	public double tinhChuViTamGiac() {
		double AB = tinhDoDaiGiua2Diem(arrPoint.get(0), arrPoint.get(1));
		double BC = tinhDoDaiGiua2Diem(arrPoint.get(1), arrPoint.get(2));
		double CA = tinhDoDaiGiua2Diem(arrPoint.get(2), arrPoint.get(1));
		return AB + BC + CA;
	}

	// Dieu kien tao tam giac
	// |AC – AB| < BC < AC + AB hay |b – c| < a < b + c.
	public void kiemTra3DoanThangCoTaoThanhTamGia() {
		double AB = tinhDoDaiGiua2Diem(arrPoint.get(0), arrPoint.get(1));
		double BC = tinhDoDaiGiua2Diem(arrPoint.get(1), arrPoint.get(2));
		double CA = tinhDoDaiGiua2Diem(arrPoint.get(2), arrPoint.get(1));
		if ((Math.abs(CA - AB) < BC) && BC < (CA + AB)) {
			System.out.println("3 diem nay tao thanh tam giac");
		} else {
			System.out.println("3 diem nay khong tao thanh tam giac");
		}
	}

	public static void main(String[] args) {
		Bai9 bai9 = new Bai9();
		bai9.nhapThongTinDiem();
		System.out.println("Chu vi tam giac la: " + bai9.tinhChuViTamGiac());
		bai9.kiemTra3DoanThangCoTaoThanhTamGia();
	}
}
