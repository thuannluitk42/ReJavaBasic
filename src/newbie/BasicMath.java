package newbie;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BasicMath {
	public static void caculatorCompoundingInterest(int p, int t, double r, int n) {
		double amount = p * Math.pow(1 + (r / n), n * t);
		double cinterest = amount - p;
		System.out.println("Lãi kép sau " + t + " năm là : " + (double) Math.round(cinterest * 100) / 100);
		System.out.println("Số tiền có được sau " + t + " năm là: " + amount);
	}

	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập p : ");
//		int p = sc.nextInt();
//		System.out.print("Nhập t : ");
//		int t = sc.nextInt();
//		System.out.print("Nhập r : ");
//		double r = sc.nextDouble();
//		System.out.print("Nhập n : ");
//		int n = sc.nextInt();
//
//		caculatorCompoundingInterest(p, t, r, n);
		
        InetAddress myIP=InetAddress.getLocalHost();
        System.out.println("Địa chỉ IP của tôi là:");
        System.out.println(myIP.getHostAddress());
	}
}
