package DuLieuSoTrongJava;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {

	private final int[] arrXiu = { 4, 5, 6, 7, 8, 9, 10 };
	private final int[] arrTai = { 11, 12, 13, 14, 15, 16, 17 };
	private final String tai = "TAI";
	private final String xiu = "XIU";

	private int tinhDiemXucXac(XucXac xx) {
		return xx.getDiemL1() + xx.getDiemL2() + xx.getDiemL3();
	}

	private String datCuocChu(int diem) {

		String result = "";
		if (diem >= 4 && diem <= 10) {
			result = "TAI";
		}
		if (diem >= 11 && diem <= 17) {
			result = "XIU";
		}
		return result;
	}

	private String checkTai(int diem) {
		String result = "";
		if (diem >= 4 && diem <= 10) {
			result = "TAI";
		}
		return result;
	}

	private String checkXiu(int diem) {
		String result = "";
		if (diem >= 11 && diem <= 17) {
			result = "XIU";
		}
		return result;
	}

	public static void main(String[] args) {
		TaiXiu tx = new TaiXiu();
		System.out.println("Go lenh TAI hoac XIU de dat cuoc");
		Scanner sc = new Scanner(System.in);
		String lenhDatCuoc = sc.nextLine();
		Random rand = new Random();
		int max = 0, min = 6;
		int rand_int1 = rand.nextInt(6) + 1;
		System.out.println(rand_int1);
		int rand_int2 = rand.nextInt(6) + 1;
		System.out.println(rand_int2);
		int rand_int3 = rand.nextInt(6) + 1;
		System.out.println(rand_int3);
		XucXac xx = new XucXac(rand_int1, rand_int2, rand_int3);
		int diemSauKhiLac = tx.tinhDiemXucXac(xx);
		System.out.println(diemSauKhiLac);
		String kq = tx.datCuocChu(diemSauKhiLac);
		if (kq.equals(lenhDatCuoc)) {
			System.out.println("Thang");
		} else {
			System.out.println("Thua");
		}

	}
}
