package Java117baitap;

import java.util.Scanner;

public class bai33 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số nguyên n = ");
		int n = nhap.nextInt();
		int s =0;
		int sodu;
		while(n>0){
			//chia lấy dư, lấy được chữ số cuối
			s = s +n % 10;
			//chia không lấy dư, lấy được chữ số đầu
			n= n / 10;
		}
		System.out.println("Tổng các số = "+s); 
	}

}
