/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import static characterstring.bai7.remVowel;
import java.util.Scanner;

/**
Nhập vào một chuỗi, hãy loại bỏ những khoảng trắng thừa trong chuỗi
 */
public class bai8 {
    static String reduceWhiteSpace(String str) {
        str = str.trim();
        while(str.indexOf("  ") != -1){
            str = str.replace("  ", " ");
        }
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = sc.nextLine();
        System.out.print("New string: " + reduceWhiteSpace(name));
    }
    
    
}
