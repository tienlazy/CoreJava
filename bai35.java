package Java117baitap;

import java.util.Scanner;

public class bai35 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số mặt trên đa giác n = ");
		int n = nhap.nextInt();
		System.out.print("Nhập chiều dài s = ");
		float s = nhap.nextFloat();
		float dientich = (float) ((n * s * s) / (4 * Math.tan (Math.PI / n)));
		System.out.println("Diện tích đa giác = "+dientich);

	}

}
