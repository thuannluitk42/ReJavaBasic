package newbie;

public class Human2 {
	public String tay, chan, dau;

	public Human2(String tay, String chan, String dau) {
		this.tay = tay;
		this.chan = chan;
		this.dau = dau;
	}

	@Override
	public String toString() {
		return tay + " --- " + chan + " --- " + dau;
	}

	public static int x = 5;
	public int y;

	public static void fn() {
		// Dòng code bên dưới sẽ sinh ra lỗi
		// vì phương thức static không thể gọi thuộc tính không được khai báo tĩnh
		// tại vì cơ chế của static là nó được tạo ra trước khi đối tượng được tạo
		// do đó y được tạo sau cùng
		// System.out.println(y);

		System.out.println(x);
	}

	// phương thức không khai báo static
	// thì có thể gọi thuộc tính static
	public void fn2() {
		System.out.println(y);
		System.out.println(x);
	}

	public static void main(String[] args) {
		Human2 hm2 = new Human2("tay A", "chan B", "dau C");
//		System.out.println("hm2 " + hm2.toString());
//
		Human2 hm22 = new Human2("tay A 1", "chan B1", "dau C1");
//		System.out.println("hm22 " + hm22.toString());
//
//		hm2 = hm22;
//		System.out.println("hm2 " + hm2.toString());
//		hm22.chan = "mat 1 chan";
//		System.out.println("hm2 " + hm2.toString());
//		hm2.dau = "mat dau";
//		System.out.println("hm22 " + hm22.toString());

		Human2.fn();
		x = x - 1;
		hm2.fn();
		hm22.fn();
		hm22.x = x+5;
		hm2.fn();
		hm22.fn();
		Human2.fn();
	}
}
