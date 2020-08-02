
import java.util.Scanner;

/*
Viết chương trình tính:

n!! = 1 * 3 * 5 *… * n (nếu n lẻ)
= 2 * 4 * 6 * … *n (nếu n chẵn)
Ví dụ: n = 7 → n!! = 1 * 3 * 5 * 7 = 105
n = 6 → n!! = 2 * 4 * 6 = 48
 */


public class bai6 {
 public static void main(String[] args){
      int num, s,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        num = sc.nextInt();
        i = 1;
        s = 1;
        while ( i<= num ){
            if ( num % 2 == 0){
                s=s*(i+1);
            }
            else{
               s=s*i;
        }
            i=i+2;
 }    
        System.out.println("n!!=" + s);
        
}}
