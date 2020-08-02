
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 Nhập 1 số nguyên n, xuất tổng các số lẻ từ 1 đến n
 */
public class bai2 {
    public static void main(String[] args) {
        int num;
        int s = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        num = sc.nextInt();
        
        int i = 1;
        while (i <= num) { 
            if ( i % 2 != 0 ) {
                s +=i;
            }
            i++;
        }
        
        System.out.println("Sum = " + s);
    }
}

