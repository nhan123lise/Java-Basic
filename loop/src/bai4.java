
import java.util.Scanner;


/**
 n!= 1 x 2 x 3 x 4 x …x n
 */
public class bai4 {
    public static void main(String[] args){
        int n,i,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
        k = 1;
        for (i=1;i<=n;i++){
            k=k*i;
              
        }
        System.out.println("n!="+k);    
        
    }
    
}
