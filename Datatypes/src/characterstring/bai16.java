/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import static characterstring.bai15.countChar;
import java.util.Scanner;

/**
Create a method that convert an input to the English-name-like string (ex: "Nguyen Thi Bao Trang" à "Trang Nguyen Thi Bao")

 */
public class bai16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = sc.nextLine();
        String []strArr = str.split(" ");
        String newName = "";
        newName += strArr[strArr.length-1];
        for ( int i = 0; i < strArr.length - 1; i++){
            newName += " ";
            newName += strArr[i];
        }
        System.out.print("New name is " + newName);
    }
    
}
