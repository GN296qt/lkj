package loops.controlsatements.breakstatemnt;
import java.util.Scanner;
public class prime {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find out whether a prime number or composite : : ");
        int n = sc.nextInt();
        boolean flag = false ;// false means prime number

        //1st method
        //  for(int i = 2 ; i <n ; i ++){
        //      if( n % i == 0){
        //          flag = true ; // true means composite
        //          break;
        //      }
        // }

        // 2nd method
        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
             if( n % i == 0){
                 flag = true ; // true means composite
                 break;
             }
        }

        if(n==1){
            System.out.println("neither prime nor composite number ");
        }
        else if(!flag){// is flag is still false// or type flag == false
            System.out.println(n+" is a prime number ");
        }
        else{
            System.out.println(n+" is a composite number ");
        }
        sc.close();
     }
    }
// enter a number to find out whether a prime number or composite : :
// 23 
// 23 is a prime number

// enter a number to find out whether a prime number or composite : :
// 64
// 64 is a composite number

// enter a number to find out whether a prime number or composite : : 
// 1 
// neither prime nor composite number