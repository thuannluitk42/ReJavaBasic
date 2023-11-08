package newbie;

public class Human1 extends Human {
	
	private String dau;

	public Human1(String tay, String chan, String dau2) {
		super(tay, chan);
		this.dau = dau2;
	}

	@Override
	public String khaiBaoPhuongThucTruuTuong() {
		// TODO Auto-generated method stub
		return null;
	}

	public void show2() {
		System.out.println("Human2  =>>>>>> Human2.show2()");
	};

}
