package Java117baitap;

import java.util.Scanner;

public class bai29 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số thập lục phân = ");
		String thaplucphan = nhap.nextLine();
		int thapphan = Integer.parseInt(thaplucphan,16);
		System.out.println("Số thập phân = "+thapphan);
		String nhiphan = Integer.toBinaryString(thapphan);
		System.out.println("Số nhị phân = "+nhiphan);

	}

}
