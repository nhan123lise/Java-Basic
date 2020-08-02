/*Điểm học phần của môn Tin học được tính như sau: chuyên cần (20%), giữa kỳ
(30%), cuối kỳ (50%). Và điểm học phần được xếp loại như sau:
● điểm &gt;=8.5 : Hạng A
● 7 &lt;= điểm &lt; 8.5 : Hạng B
● 5.5 &lt;= điểm &lt; 7 : Hạng C
● 4 &lt;= điểm &lt; 5.5 : Hạng D
● điểm &lt; 4 : Hạng F
Viết chương trình nhập điểm môn Tin học và in ra cho người dùng biết điểm học
phần môn này và xếp hạng gì?
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("nhap so diem");
        Float a;
        a = sc.nextFloat();
        float m = (float) a*(20/100) ;
        float n = (float) a*(30/100);
        float k = (float) a*(50/100);
        if ( a >= 8.5 ) { System.out.println ("Hạng A");}
        else if ( a >= 7 ) { System.out.println ("Hạng B");}
        else if ( a >= 5.5 ) {System.out.println ("Hạng C");}
        else if ( a >= 4 ) {System.out.println("Hạng D");}
        else {System.out.println("Hạng F");}
        System.out.println("diem chuyen can la" + m);
        System.out.println("diem giua ky la" + n);
        System.out.println("diem cuoi ky la" + k);
        }
        
    }
        
    
        
        
        
    

