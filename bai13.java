package Java117baitap;
import java.util.Scanner;
public class bai13 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập chiều rộng a = ");
		float a = nhap.nextFloat();
		System.out.print("Nhập chiều dài b = ");
		float b = nhap.nextFloat();
		System.out.println("Chu vi hình chữ nhật = "+2*(a+b));
		System.out.println("Chu vi hình chữ nhật = "+a*b);	
	}

}
