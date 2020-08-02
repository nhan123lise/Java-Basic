/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

import java.util.Scanner;

/**
 Nhập vào chuỗi String là chuỗi nhị phân. Chuyển thành số nguyên và in ra màn
hình
 */
public class bai4 {
    public static void main(String args[]){
       Scanner input = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input.nextLine();
       System.out.println("Output: "+Integer.parseInt(binaryString,2));
    }
}
