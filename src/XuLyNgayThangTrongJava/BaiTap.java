package XuLyNgayThangTrongJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;

public class BaiTap {
	// static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void hienThiNgayDauVaCuoiThangHienTai() {
		Calendar cal = Calendar.getInstance();
//		Date date = cal.getTime();

		// hiển thị thời gian hiện tại
		int thangHienTai = cal.get(Calendar.MONTH) + 1;
		System.out.println("Tháng hiện tại là " + thangHienTai);

		// tìm và hiển thị ngày đầu tháng và ngày cuối tháng của tháng hiện tại
		int ngayDauThang = cal.getActualMinimum(Calendar.DATE);
		System.out.println("Ngày đầu của tháng hiện tại trong năm " + cal.get(Calendar.YEAR) + " = " + ngayDauThang);
		int ngayCuoiThang = cal.getMaximum(Calendar.DATE);
		System.out.println("Ngày cuối của tháng hiện tại trong năm " + cal.get(Calendar.YEAR) + " = " + ngayCuoiThang);
	}

	public void hienThiThoiGianHienTaiOHanQuoc() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		Date date = cal.getTime();
		System.out.println("Thời gian hiện tại là: " + sdf.format(date));

	}

	public void hienThiNgayHienTaiSau2Tuan() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		Date date = cal.getTime();
		System.out.println("Ngày hiện tại là " + date);

		cal.add(Calendar.DAY_OF_MONTH, 14);
		Date dateAfter = cal.getTime();
		System.out.println("Ngày cách ngày hiện tại 2 tuần là " + sdf.format(dateAfter));

	}

	// Viết chương trình hiển thị thứ của ngày đầu tiên và cuối cùng
	// của tháng hiện tại.

	public void hienThiThuTheoNgayCuaThangHienTai() {
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DATE));
		String minDate = String.valueOf(cal.getTime()).substring(0, 3);
		String str = "";
		switch (minDate) {
		case "Mon":
			str = "Thứ 2";
			break;
		case "Tue":
			str = "Thứ 3";
			break;
		case "Wed":
			str = "Thứ 4";
			break;
		case "Thu":
			str = "Thứ 5";
			break;
		case "Fri":
			str = "Thứ 6";
			break;
		case "Sat":
			str = "Thứ 7";
			break;
		case "Sun":
			str = "Chủ nhật";
			break;
		}
		System.out.println("thứ của ngày đầu tiên trong tháng này là " + str);
		cal.set(Calendar.DAY_OF_MONTH, cal.getMaximum(Calendar.DATE));
		String maxDate = String.valueOf(cal.getTime()).substring(0, 3);
		String str2 = "";
		switch (maxDate) {
		case "Mon":
			str2 = "Thứ 2";
			break;
		case "Tue":
			str2 = "Thứ 3";
			break;
		case "Wed":
			str2 = "Thứ 4";
			break;
		case "Thu":
			str2 = "Thứ 5";
			break;
		case "Fri":
			str2 = "Thứ 6";
			break;
		case "Sat":
			str2 = "Thứ 7";
			break;
		case "Sun":
			str2 = "Chủ nhật";
			break;
		}
		System.out.println("thứ của ngày cuối cùng trong tháng này là " + str2);

	}

	public void hienThiThuTheoNgayCuaThangHienTai2() {
		Calendar cal = Calendar.getInstance();

		Map<String, String> mapThu = new HashMap<>();
		mapThu.put("Mon", "Thứ hai");
		mapThu.put("Tue", "Thứ ba");
		mapThu.put("Wed", "Thứ tư");
		mapThu.put("Thu", "Thứ năm");
		mapThu.put("Fri", "Thứ sáu");
		mapThu.put("Sat", "Thứ bảy");
		mapThu.put("Sun", "Chủ nhật");

		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DATE));
		String minDate = String.valueOf(cal.getTime()).substring(0, 3);
		String str = mapThu.get(minDate);
		System.out.println("thứ của ngày đầu tiên trong tháng này là " + str);

		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
		String maxDate = String.valueOf(cal.getTime()).substring(0, 3);
		String str2 = mapThu.get(maxDate);
		System.out.println("thứ của ngày cuối cùng trong tháng này là " + str2);
	}

	// Viết chương trình hiển thị ngày của tuần trước và tuần kế tiếp của ngày thứ
	// 5.
	public void hienThiNgayCuaTuanTruocVaTuanSauCuaThu5() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		cal.add(Calendar.DATE, -7);
		Date date = cal.getTime();
		System.out.println("Ngày thứ 5 tuần trước là ngày " + sdf.format(date));
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		cal2.add(Calendar.DATE, 7);
		Date date2 = cal2.getTime();
		System.out.println("Ngày thứ 5 tuần sau là ngày " + sdf.format(date2));
	}

	// Viết chương trình nhập vào 1 số nguyên n bất kỳ và tìm ngày cách ngày hiện
	// tại n ngày.
	public void hienThiNgayCachXNgaySoVoiNgayHienTai() {
		System.out.println("Ngày bạn mong muốn hiển thị là: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, x);
		Date date = cal.getTime();
		if (x < 0) {
			System.out.println(x + " ngày trước là ngày: " + sdf.format(date));
		} else {
			System.out.println(x + " ngày sau là ngày: " + sdf.format(date));
		}

	}

	public static void main(String[] args) {
		BaiTap bt = new BaiTap();
		// hienThiNgayDauVaCuoiThangHienTai();
		// bt.hienThiThoiGianHienTaiOHanQuoc();
		// bt.hienThiNgayHienTaiSau2Tuan();
		// bt.hienThiThuTheoNgayCuaThangHienTai();
		// bt.hienThiThuTheoNgayCuaThangHienTai2();
		// bt.hienThiNgayCuaTuanTruocVaTuanSauCuaThu5();
		bt.hienThiNgayCachXNgaySoVoiNgayHienTai();
	}

}
