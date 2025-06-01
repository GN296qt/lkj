package loops.forloop.practice;
import java.util.Scanner;
public class ap {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n terms of AP series  :");
        int n = sc.nextInt();
        System.out.print("enter first term : ");
        int a = sc.nextInt();
        System.out.print("difference between two terms : ");
        int d = sc.nextInt();

        System.out.print(a +" ");
        for(int i = 0; i <= n ; i++){
              System.out.print(a + i*d + " ");
        }
        sc.close();
     }
    }

// enter n terms of AP series  :5        
// enter first term : 1
// difference between two terms : 2      
// 1 3 5 7 9 11 