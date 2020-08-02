/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Nhập vào một chuỗi. In ra màn hình chuỗi in hoa bằng 2 cách
 */
public class bai2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String str = sc.nextLine();
        //su dung ham co san
        System.out.print("New string: " + str.toUpperCase());
    }
    
}
