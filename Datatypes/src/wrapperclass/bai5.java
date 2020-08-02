/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

import java.util.Scanner;

/**
 Nhập vào chuỗi String là chuỗi tứ phân. Chuyển thành số nguyên và in ra màn
hình
 */
public class bai5 {
    public static void main(String[] args){
        System.out.print("Input string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Ouput " + Integer.parseInt(str,4));
    }
    
}
