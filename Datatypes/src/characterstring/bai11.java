/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Nhập 1 chuỗi bất kì. Đếm xem có bao nhiêu từ
 */
public class bai11 {
    static int countLetter(String str){
        int n = 0;
        for ( int i = 0; i < str.length(); i++){
            if ( Character.isLetter(str.charAt(i))){
                n+=1;
            }
        }
        return n;
    }
    public static void main(String[] args){
        System.out.print("Enter string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Number of letters in string " + countLetter(str));
        
    }
}
