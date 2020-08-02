/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenthithanhnhan;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        int s = 0;
        while(n <= 0){
            System.out.print("Please re-enter n= ");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++){
            if((i % 2 == 0) && (i % 3 ==0)){
                s+=i;
            }
        }
        System.out.print("Sum of elements being divisble by 2 and 3 are "+s);
    }
}