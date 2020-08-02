/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

import java.util.Scanner;

/**
Nhập vào chuỗi String chứa số thực. Chuyển thành số thực và in ra màn hình
 */
public class bai2 {
    public static void main(String[] args){
        System.out.print("Enter your string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        float b = Float.parseFloat(str); 
        System.out.print("Print float "+b);
    }
    
}
