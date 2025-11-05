package TugasPBO_5_Muhammad_Rifa;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bil;
        int max, min;
        
        System.out.print("Masukan bilangan ke-1 : ");
        bil = sc.nextInt();
        max = bil;
        min = bil;

        for (int i = 1; i < 10; i++) {
            System.out.print("Masukan bilangan ke-" + (i+1) + " : ");
            bil = sc.nextInt();
            
            if(bil > max){
                max = bil;
            }
            if(bil < min){
                min = bil;
            }
        }

        System.out.println("Bilangan Terbesar : " + max);
        System.out.println("Bilangan Terkecil : " + min);
    }
}
