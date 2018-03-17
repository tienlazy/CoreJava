package Java117baitap;

import java.io.Console;
import java.util.Scanner;

public class bai42 {

	public static void main (String[] args) {
	        Console c = System.console();
	        System.out.println("Nhập mật khẩu : ");
	        char[] ch = c.readPassword();
	        // convert char array into string
	        String pass = String.valueOf(ch);
	        System.out.println("Mật khẩu là : " + pass);
	
	}
}
