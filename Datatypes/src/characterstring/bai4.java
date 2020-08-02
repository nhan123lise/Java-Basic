/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Nhập vào một chuỗi, Đếm ký tự và số xuất hiện trong một chuỗi
 */
public class bai4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int charCount = 0;
        int digitCount = 0;
        for ( int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                digitCount++;
            } else if (Character.isLetter(str.charAt(i))){
                charCount++;
            }
        }
        System.out.print("Number of character: " + charCount);
        System.out.println();
        System.out.print("Number of digits: " + digitCount);
            
    }
    
}
