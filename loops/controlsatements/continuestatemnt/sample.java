package loops.controlsatements.continuestatemnt ;

public class sample {
     public static void main(String[] args) {
         for(int i = 1 ; i <= 100 ; i++){
           if(i == 14 || i == 27){
                continue;
           }
           if(i % 2 == 0 || i % 3 == 0){
                   System.out.print(i +" ");
           }
         }
     }
    }
    // print numbers which come in table of 2 and a3 but 14 and 27 should not be printed
    // 2 3 4 6 8 9 10 12 15 16 18 20 21 22 24 26 28 30 32 33 34 36 38 39 40 42 44 45 46 48 50 51 52 54 56 57 58 60 62 63 64 66 68 69 70 72 74 75 76 78 80 81 82 84 86 87 88 90 92 93 94 96 98 99 100