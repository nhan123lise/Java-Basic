/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số chính phương hay
không
 */
public class bai7 {
    static int inputNum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while ( n <= 0 ){
            if ( n <= 0 ){
                System.out.print("Please in put n again. n = ");
                n = sc.nextInt();
            }
        }
        return n;
    }
    static boolean IsSquareNUm(int n){
        for (int i = 1; i <= n/2; i++){
            if ( n == i*i ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        int a = inputNum();  
        if ( IsSquareNUm(a)){
            System.out.print(a+" is square num");
        }else{
            System.out.print(a+" is not square num");
        }
    }
}
