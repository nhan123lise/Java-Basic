/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 5.	Nhập số nguyên n (0 < n <= 10). Tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
 */
public class bai5 {
    public static void main(String[] args) {
        
        int n;
        int s = 0;
        int gt = 1;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            
            if(n <= 0 || n > 10){
                System.out.println("Vui long nhap so 0 < n <= 10");
            }
        } while(n <= 0 || n > 10);
        
        
        
        for (int i = 1; i <= n; i++) {
            gt = gt * i;
            s += gt;
        }
        
        System.out.println("s = " + s);
       
    }
}
    
    

