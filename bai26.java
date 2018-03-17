package Java117baitap;

import java.util.Scanner;

public class bai26 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số bát phân = ");
		String batphan = nhap.nextLine();
		int thapphan = Integer.parseInt(batphan);
		System.out.println("Số thập phân = "+thapphan);
		String nhiphan = Integer.toBinaryString(thapphan);
		System.out.println("Số nhị phân = "+nhiphan);

	}

}
