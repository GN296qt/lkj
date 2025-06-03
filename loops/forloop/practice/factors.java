package loops.forloop.practice;
import java.util.Scanner;
public class factors  {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter number  : ");
     int n = sc.nextInt();
     
     System.out.print(" factors of "+ n+ " are :");
     for(int i = 1; i <= n ; i++)
{    
     if(n % i == 0){
          System.out.print( i+ " ");
     }
    
}     sc.close();
     }
    }

// enter number  : 24
// factors of 24 are :1 2 3 4 6 8 12 24 