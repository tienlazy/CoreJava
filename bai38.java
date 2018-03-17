package Java117baitap;

import java.util.Scanner;

public class bai38 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào một chuỗi : ");
		String chuoi = nhap.nextLine();
		int thu=0;
		int khoangcach=0;
		int so=0;
		int khac=0;
		char[] st = chuoi.toCharArray();
		//Duyệt từ đầu chuỗi đến cuối chuỗi
		for(int i=0;i<chuoi.length();i++)
		{
			//isLetter tính số chữ nhập vào
			if(Character.isLetter(st[i]))
			{
				thu++;
			}
			//isSpace tính khoảng cách nhập vào
			else if(Character.isSpace(st[i]))
			{
				khoangcach++;
			}
			//isDigit tính số nhập vào
			else if(Character.isDigit(st[i]))
			{
				so++;
			}
			else
			{
				khac++;
			}
		}
		System.out.println("Tổng thư nhập vào = "+thu);
		System.out.println("Tổng số nhập vào = "+so);
		System.out.println("Tổng khoảng cách nhập vào = "+khoangcach);
		System.out.println("Khác = "+khac);
	}

}
