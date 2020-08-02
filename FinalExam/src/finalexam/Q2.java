/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = sc.nextFloat();
        float result;
        if ( x >= 5){
            result = 11*x*x + 7*x + 20;
        }else{
            result = (-2)*x*x + x - 20;
        }
        System.out.print("f(x) is: " + result);
    }
}
