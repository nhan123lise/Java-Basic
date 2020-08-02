
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class bai5 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        num = sc.nextInt();
        int i,t ;
        for (i = 1; i <= 10; i++ ){
            t=num*i;
            System.out.println(num+"x"+i+"="+t);
    }
}}
