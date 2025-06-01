package loops.forloop.practice;
     import java.util.Scanner;
     public class table {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter number whose table to be printed add till which number ");
          int n = sc.nextInt();
          int m = sc.nextInt();
          System.out.println("table of "+ n+ " is");
          for(int i = n ; i <= n * m ; i+=19 ){
                System.out.println(i);
          }
          sc.close();
     }
    }
// enter number whose table to be printed add till which number
// 19 10
// table of 19 is
// 19
// 38
// 57
// 76
// 95
// 114
// 133
// 152
// 171
// 190