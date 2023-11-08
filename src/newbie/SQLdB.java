package newbie;

public class SQLdB implements IDatabase {

	@Override
	public void connectDb() {
		System.out.println(urlDB);
		System.out.println(urlDB2);
		System.out.println(urlDB3);

	}
	public static void main(String[] args) {
		SQLdB sqLdB = new SQLdB();
		sqLdB.connectDb();
	}

}
