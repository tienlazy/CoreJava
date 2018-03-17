package Java117baitap;

import java.util.Scanner;

public class bai24 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số nhị phân = ");
		String nhiphan = nhap.nextLine();
		int thapphan = Integer.parseInt(nhiphan,2);
		String batphan = Integer.toOctalString(thapphan);
		System.out.println("Số bát phân = "+batphan);

	}

}
