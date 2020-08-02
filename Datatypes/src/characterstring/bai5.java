/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Nhập vào một chuỗi. Đổi những ký tự đầu tiên của mỗi từ thành chữ in hoa
 */
public class bai5 {
    static String getStandardName(String name){
        String newName = "";
        newName += Character.toUpperCase(name.charAt(0));
        for(int i = 1; i < name.length(); i++) {
            char chBefore = name.charAt(i-1);
            char ch = name.charAt(i);
            if(Character.isWhitespace(chBefore) && Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
            }
            newName += ch;

        }
        return newName;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = sc.nextLine();
        System.out.print("New string: " + getStandardName(name));
    }
}
