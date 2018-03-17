package Java117baitap;
import java.util.Scanner;
public class bai7 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số : ");
		int a = nhap.nextInt();
		for(int i=1;i<=10;i++)
		{
			int b;
			b=a*i;
			System.out.print(b + " ");
		}

	}

}
