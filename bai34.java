package Java117baitap;

import java.util.Scanner;

public class bai34 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập chiều dài một cạnh s = ");
		float s =nhap.nextFloat();
		float dientich =(float) (( 6 * s *s) / (4 * Math.tan(Math.PI/6)));
		System.out.println("diện tích hình lục giác = "+dientich);

	}
}
