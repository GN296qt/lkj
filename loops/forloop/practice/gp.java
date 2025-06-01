package loops.forloop.practice;
import java.util.Scanner;
public class gp {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter no. of trerms : ");
         int n =sc.nextInt();
         System.out.println("enter first number : ");
         int a = sc.nextInt();
         System.out.println("enter common ratio :");
         int r = sc.nextInt();
         for(int i = 0 ; i < n ; i++){
                System.out.print((int)(a*Math.pow(r,i))+" ");
         }
         sc.close();
     }
    }
