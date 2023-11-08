package newbie;

import java.util.Scanner;

public class Bai8 {
//Java - Xác định vị trí của một điểm so với đường tròn và hiển thị thông báo.
	public int x, y;

	public Bai8(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Bai8() {
	}

	public void nhapThongTinDiem() {
		System.out.println("Nhap toa do diem A");
		System.out.print("Nhap Ax: ");
		Scanner scanner = new Scanner(System.in);
		this.x = scanner.nextInt();
		System.out.print("Nhap Ay: ");
		this.y = scanner.nextInt();
		System.out.println("Diem A co toa do la: A(" + this.x + " , " + this.y + ")");
	}

	public double tinhDoDaiGiua2Diem(Bai8 toaDoA, Bai8 toaDoO) {
		return Math.sqrt(Math.pow((toaDoA.x - toaDoO.x), 2) + Math.pow((toaDoA.y - toaDoO.y), 2));
	}

	public double tinhDoDaiDenGocToaDoCua1Diem() {
		return Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
	}

	public void checkViTriDiemSoVoiDuongTron() {
		double doDaiDiemDenTam = tinhDoDaiDenGocToaDoCua1Diem();
		System.out.print("Nhap ban kinh R");
		Scanner scanner = new Scanner(System.in);
		double banKinhR = scanner.nextDouble();
		if (doDaiDiemDenTam > banKinhR) {
			System.out.println("Diem nay nam ngoai duong truon");
		} else if (doDaiDiemDenTam < banKinhR) {
			System.out.println("Diem nay nam trong duong truon");
		} else {
			System.out.println("Diem nay nam tren duong truon");
		}
	}

	public static void main(String[] args) {
		Bai8 b8 = new Bai8();
		b8.nhapThongTinDiem();
		b8.checkViTriDiemSoVoiDuongTron();
	}

}
