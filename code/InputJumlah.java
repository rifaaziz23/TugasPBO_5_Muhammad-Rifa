package TugasPBO_5_Muhammad_Rifa;

import java.util.Scanner;

public class InputJumlah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka, avrg, total = 0,count = 0;
        
        System.out.print("Masukan Jumlah Bilangan : ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukan angka ke-"+ i + " : ");
            angka = sc.nextInt();
            total += angka;
            count++;
        }
        avrg = total / count;
        
        System.out.println("Total Jumlah Bilangan : "+ total);
        System.out.println("Rata - Rata Bilangan : "+ avrg);
    }
}
