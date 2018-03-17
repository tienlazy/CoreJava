package Java117baitap;

import java.util.Scanner;
public class bai19 {
      public static void main(String args[])
    {
       Scanner nhap = new Scanner(System.in);
       System.out.print("Nhập số thập phân = ");
       int sothapphan = nhap.nextInt();
       String nhiphan = Integer.toBinaryString(sothapphan);
       System.out.println("Số nhị phân = "+nhiphan);
    }
}
