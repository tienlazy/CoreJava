package Java117baitap;
import java.util.Scanner;
public class bai20 {
      public static void main(String args[])
    {
       Scanner nhap = new Scanner(System.in);
       System.out.print("Nhập số thập phân = ");
       int thapphan = nhap.nextInt();
       String lucphan = Integer.toHexString(thapphan);
       System.out.println("Số thập lục phân = "+lucphan);
    }
}