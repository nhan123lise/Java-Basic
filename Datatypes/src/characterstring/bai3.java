/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Nhập vào một chuỗi. In ra màn hình chuỗi in thường bằng 2 cách
 */
public class bai3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = sc.nextLine();
        System.out.print("New string: " +str.toLowerCase());
    }
    
}
