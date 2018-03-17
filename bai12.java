package Java117baitap;
import java.util.Scanner;
public class bai12 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập hệ số a = ");
		int a = nhap.nextInt();
		System.out.print("Nhập hệ số b = ");
		int b = nhap.nextInt();
		System.out.print("Nhập hệ số c = ");
		int c = nhap.nextInt();
		System.out.println("Trung bình các số = " + (a+b+c)/3);
	}

}
