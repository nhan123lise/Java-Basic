/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
 Nhập 1 chuỗi bất kì (Latinh), liệt kê xem mỗi ký tự xuất hiện mấy lần
 */
public class bai10 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		String a ;
		System.out.print("Nhap chuoi: ");
		a = str.nextLine();
		
		int []count  = new int[256];
		
		
		for(int i = 0; i < a.length(); i++) {
                    char ch = a.charAt(i);
                    count[ch] +=1;	
		}
		
		for(int i = 0; i < 256; i++) {
                    if( count[i] > 0) {
                            System.out.printf("%c : %d\n", (char)i, count[i]);
                    }
		}

	}
    
}
