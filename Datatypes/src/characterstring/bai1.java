/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1 sau đó in kết quả ra màn
hình
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input S1: ");
        String str1 = sc.nextLine();
        System.out.print("Input s2: ");
        String str2 = sc.nextLine();
        System.out.println(str1.concat(str2));
    
    }
}
