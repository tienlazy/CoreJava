package Java117baitap;
import java.util.*;
public class bai18 {

	public static void main(String[] args) 
		{
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập số nhị phân thứ nhất = ");
		String sonhiphan1 = nhap.nextLine();
		System.out.print("Nhập số nhị phân thứ hai = ");
		String sonhiphan2 = nhap.nextLine();
		int thapphan1 = Integer.parseInt(sonhiphan1,2);
		int thapphan2 = Integer.parseInt(sonhiphan2,2);
		int thapphan = thapphan1*thapphan2;
		System.out.println("Tổng hai số nhị phân =  "+thapphan);
		String nhiphan = Integer.toBinaryString(thapphan);
		System.out.println("Tổng hai số nhị phân =  "+nhiphan);
			 }
	
 }
