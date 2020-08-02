/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import static characterstring.bai5.getStandardName;
import java.util.Scanner;

/**
Nhập vào một chuỗi. In ra màn hình chuỗi:
● Đã loại bỏ hết tất cả các kí tự không thuộc a - z, A-Z và ký tự trắng trong
chuỗi đầu vào.
● Viết hoa ký tự đầu tiên của mỗi từ.
Ví dụ:
&quot;a1b2c3d4 a1b2c3d4&quot; ---&gt; Output: Abcd Abcd
Are you 25 years old? ---&gt; Output: Are You  Years Old?
 */
public class bai6 {
    static String eliminateDigit(String str){
        String newStr = "";
        for ( int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
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
        String newname = eliminateDigit(name);
        System.out.print("New string: " + getStandardName(newname));
    }
}
