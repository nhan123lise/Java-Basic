
import java.util.Scanner;

/*
 Nhập vào số nguyên n, in ra tổng các số chẵn và tổng các số lẻ nhỏ hơn hoặc bằng
n
 */

public class bai3 {
    public static void main(String[] args) {
        int num;
        int s_le = 0;
        int s_chan = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        num = sc.nextInt();
        
        int i = 0;
        while (i <= num) { 
            if ( i % 2 != 0 ) {
                s_le +=i;
            }
            else {
                s_chan +=i;
            }
            i++;
        }
        
        System.out.println("Sum chan = " + s_chan);
        System.out.println("Sum le = " + s_le);
    }
}
    

