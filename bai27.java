package Java117baitap;

import java.util.Scanner;

public class bai27 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số bát phân = ");
		String batphan = nhap.nextLine();
		int thapphan = Integer.parseInt(batphan,8);
		System.out.println("Số thập phân = "+thapphan);
		String thaplucphan = Integer.toHexString(thapphan);
		System.out.println("Số thập lục phân = "+thaplucphan);

	}

}
