/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
6.	Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
 */
public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = -1;
        do{
            i += 2;
            if (i==5)continue;
            if (i==7)continue;
            if (i==93)continue;
            System.out.println(i+"");
            }while (i <= 97);
        }
    }
    

