package TugasPBO_5_Muhammad_Rifa;

import java.util.Scanner;

public class InputGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan banyak angka : ");
        int n = sc.nextInt();
        int angka = 1;
        int total = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
        }
        
        
        System.out.println("\nTotal penjumlahan : " + total);
    }
}
