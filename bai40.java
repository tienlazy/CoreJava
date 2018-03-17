package Java117baitap;

import java.nio.charset.Charset;

public class bai40 {

	public static void main(String[] args) {
		System.out.println("Danh sách các ký tự có sẵn là : ");  
	    for (String str : Charset.availableCharsets().keySet()) {
	      System.out.println(str);
	    }

	}

}
