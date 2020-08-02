/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstring;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String str = sc.nextLine();
        System.out.println("String inputed: " + str);
        String []strArr = str.split(" ");
        int sumInteger = 0;
        float sumFloat = 0;
        String sumString = "";
        for ( int i = 0; i < strArr.length;i++){
            try{
                int num = Integer.parseInt(strArr[i]);
                sumInteger += num;
                
            }catch(Exception e){
                try{
                    float numF = Float.parseFloat(strArr[i]);
                    sumFloat += numF;
                }catch(Exception e1){
                    sumString += strArr[i];
                }
            }
        }
        System.out.println("Sum Integer " +sumInteger);
        System.out.println("Sum Float " + sumFloat);
        System.out.println("Sum String " + sumString);
        
    }

    
}
