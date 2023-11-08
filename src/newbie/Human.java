package newbie;

public abstract class Human {

	public String tay, chan;

	public abstract String khaiBaoPhuongThucTruuTuong();

	public void show2() {
		System.out.println("Human  =>>>>>> Human.show2()");
	}

	public Human(String tay, String chan) {
		super();
		this.tay = tay;
		this.chan = chan;
	};

}
