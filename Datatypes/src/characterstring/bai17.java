/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
Create a method that reverse an input by each word (ex "Nguyen Thi Bao Trang" à "Trang Bao Thi Nguyen")

 */
public class bai17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ");
        String str = sc.nextLine();
        String []strArr = str.split(" ");
        String newName = "";
        for ( int i = strArr.length - 1; i >= 0; i--){
            newName += " ";
            newName += strArr[i];
        }
        System.out.print("New name is " + newName);
    }
}
