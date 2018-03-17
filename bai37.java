package Java117baitap;

import java.util.Scanner;

public class bai37 {


	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào một chuỗi : ");
		String chuoi = nhap.nextLine();
		StringBuffer dao = new StringBuffer(chuoi);
		System.out.println("Chuỗi được đảo là : "+dao.reverse().toString());
	}

}
