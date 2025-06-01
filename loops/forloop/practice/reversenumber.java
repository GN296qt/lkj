package loops.forloop.practice;
import java.util.Scanner;
public class reversenumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter a number to print numbers in reverse number till one :");
         int n = sc.nextInt();
         for(int i = n ; i >= 1; i--){
                System.out.print(i+" ");
         }
         sc.close();
     }
    }

    
// enter a number to print numbers in reverse number till one :10
// 10 9 8 7 6 5 4 3 2 1 
