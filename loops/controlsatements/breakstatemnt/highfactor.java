package loops.controlsatements.breakstatemnt;
import java.util.Scanner;
public class highfactor {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter a number whose factor to be find : ");
         int n = sc.nextInt();
         
         System.out.println("1st method ");
         int high = 1;
         for(int i = 1 ; i <n; i++){
               if(n % i == 0){
                      high = i ;
                
               }
         }
         System.out.println("highest factorof of "+ n+ " other than itself " +high);

        System.out.println("2nd method");
         for(int i = n- 1 ; i >= 1 ; i --){
             if(n % i == 0){
                 System.out.println("highest factor of "+n+" other than itself is "+i);
                 break;
             }
         }
         sc.close();
     }
    }
// enter a number whose factor to be find : 24  
// 1st method 
// highest factorof of 24 other than itself 12
// 2nd method
// highest factor of 24 other than itself is 12

