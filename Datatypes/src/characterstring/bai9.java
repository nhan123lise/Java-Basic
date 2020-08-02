/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import static characterstring.bai8.reduceWhiteSpace;
import java.util.Scanner;

/**
Đổi các từ ở đầu câu sang chữ hoa và những từ không phải đầu câu sang chữ
thường.
 */
public class bai9 {
    static String newName(String str){
        String newstr = "";
        newstr += Character.toUpperCase(str.charAt(0));
        for ( int i = 1; i < str.length(); i++){
            char chBefore = str.charAt(i-1);
            char ch = str.charAt(i);
            if (Character.isWhitespace(chBefore) && Character.isLetter(ch)){
                ch = Character.toUpperCase(ch);        
            }else{
                ch = Character.toLowerCase(ch);
            }
            newstr += ch;
        } 
        return newstr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = sc.nextLine();
        System.out.print("New string: " + newName(name));
    }
}
