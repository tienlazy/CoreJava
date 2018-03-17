package Java117baitap;

import java.util.Scanner;

public class bai25 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số thập phân = ");
		int thapphan = nhap.nextInt();
		String batphan = Integer.toOctalString(thapphan);
		System.out.println("Số bát phân = "+batphan);

	}

}
