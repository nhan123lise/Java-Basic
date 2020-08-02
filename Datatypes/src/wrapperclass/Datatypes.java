/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author mac
 */
import java.util.Scanner;
    public class Datatypes {
    
    static String reduceWhiteSpace(String str) {
        str = str.trim();
        
        while(str.indexOf(" ") != -1){
            str = str.replace(" ", "");
        }
        
        return str;
    }
    
    static String getStandardName(String name) {
        name = reduceWhiteSpace(name);
        name = name.toLowerCase();
        String newName = "";
        
        newName += Character.toUpperCase(name.charAt(0));
        for(int i = 1; i < name.length(); i++) {
            char chBefore = name.charAt(i - 1);
            char ch = name.charAt(i);
            
            if(Character.isWhitespace(chBefore) && Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
            }
            
            newName += ch;
        }
        
        return newName;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a String: ");
        String str = sc.nextLine();
        
        System.out.println("String inputed: " + str);
        
        System.out.println("String removed white space: |" + getStandardName(str) + "|");
        
        
    }

    
}
