package loops.forloop.practice ;
import java.util.Scanner;
public class hello {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter number of times to print hello world : ");
          int n = sc.nextInt();
          for(int i = 0 ; i < n ; i++){
                System.out.println("hello world");
          }
          sc.close();
     }
    }

// enter number of times to print hello world : 5
// hello world
// hello world
// hello world
// hello world
// hello world    

