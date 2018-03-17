package Java117baitap;

import java.util.Scanner;

public class bai36 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vĩ độ của tọa độ 1 = ");
		double x1 = nhap.nextDouble();
		x1 = Math.toRadians(x1);
		System.out.print("Nhập kinh độ của tọa độ 1 = ");
		double x2 = nhap.nextDouble();
		x2 = Math.toRadians(x2);
		System.out.print("Nhập vĩ độ của tọa độ 2 = ");
		double y1 = nhap.nextDouble();
		y1 = Math.toRadians(y1);
		System.out.print("Nhập kinh độ của tọa độ 2 = ");
		double y2 = nhap.nextDouble();
		y2 = Math.toRadians(y2);
		float bankinh=(float) 6371.01;
		float duongkinh= (float) (bankinh * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
		System.out.println("khoảng cách giữa các đoạn này = "+duongkinh);
	}

}
