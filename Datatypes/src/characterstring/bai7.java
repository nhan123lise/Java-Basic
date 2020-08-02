/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;
import java.util.List; 
import java.util.Arrays; 

/**
Viết hàm để tìm kiếm và xóa đi tất cả nguyên âm có trong câu.
 */
public class bai7 {
    static String remVowel(String str) 
    { 
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
        List<Character> al = Arrays.asList(vowels); 
        StringBuffer sb = new StringBuffer(str); 
        for(int i = 0; i < sb.length(); i++){ 
            if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
            } 
        } 
        return sb.toString(); 
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = sc.nextLine();
        System.out.print("New string: " + remVowel(name));
    }
}
