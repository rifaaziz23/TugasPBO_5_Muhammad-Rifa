package TugasPBO_5_Muhammad_Rifa;

public class PerbedaanIncrement {
    public static void main(String[] args) {
        int i = 0;
        
//        Increment Postfix i++
        while( i++ < 3 ){
            System.out.println("Nilai i (Postfix) : " + i);
        }
        System.out.println("Nilai Akhir i (Postfix) : " + i);
        
        System.out.println();
        
        i = 0;
        
//        Increment Prefix ++i
        while( ++i < 3 ){
            System.out.println("Nilai i (Prefix) : " + i);
        }
        System.out.println("Nilai Akhir i (Prefix) : " + i);
    }
}
