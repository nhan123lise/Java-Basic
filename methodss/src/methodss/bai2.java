/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;
import static methodss.Methodss.inputIntNumber;

/**
 Nhập số nguyên n (0 < n <= 10). Viêt hàm tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n

 */
public class bai2 {
    static int inputIntNumber() {
        int n;
        Scanner sc = new Scanner(System.in);
        do{            
            n = sc.nextInt();
            if(n <= 0 || n > 10 ) {
                System.out.print("Pleas input a number > 1. Again: ");
            }
        } while(n <= 0 || n > 10 );
        
        return n;
    }
    static int sum(int n){
        int s = 1;
        int k = 1;
        for ( int i = 2; i <= n; i++){
            k = k*i;
            s += k;
        }
        return s;
    }
    public static void main(String[] args) {   
        int n;
        System.out.print("n = ");
        n = inputIntNumber();
        int s = sum(n);
        System.out.println("Sum = " + s);
    } 
    
}
