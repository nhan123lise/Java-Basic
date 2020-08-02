
import java.util.Scanner;

/**
 Nhập 1 số nguyên n, xuất tổng từ 1 đến n
 */
public class bai1 {
    
    public static void main(String[] args) {
        int num;
        int s = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        num = sc.nextInt();
        
        int i = 0;
        while (i <= num) {
            s += i;
            i++;
        }
        
        System.out.println("Sum = " + s);
    }
}
    

