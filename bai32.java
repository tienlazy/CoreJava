package Java117baitap;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số nguyên thứ nhất = ");
		int a = nhap.nextInt();
		System.out.print("Nhập số nguyên thứ hai = ");
		int b = nhap.nextInt();
		if(a!=b)
			System.out.println(+a+"!="+b);
		if(a==b)
			System.out.println(+a+"="+b);
		if(a>b)
		System.out.println(+a+">"+b);
		if(a<b)
			System.out.println(+a+"<"+b);
		if(a>=b)
		System.out.println(+a+">"+b);
		if(a<=b)
			System.out.println(+a+"<="+b);
	}

}
