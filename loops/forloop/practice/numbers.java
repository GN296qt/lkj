package loops.forloop.practice;
import java.util.Scanner;
public class numbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number to be printed from one :  ");
        int n = sc.nextInt();
        System.out.println("numbers are :");
        for(int i = 1 ; i <= n ; i++){
               System.out.print(i+" ");
        }
        sc.close();
     }
    }
    
// enter the number to be printed from one :  5
// numbers are :
// 1 2 3 4 5

