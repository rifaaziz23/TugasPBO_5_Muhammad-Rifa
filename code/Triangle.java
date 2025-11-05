package TugasPBO_5_Muhammad_Rifa;

public class Triangle {
    public static void main(String[] args) {
        int a = 7;
//        Half Triangle
        System.out.println("Half Triangle");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Full Triangle
        System.out.println("\nFull Triangle");
        
	for (int i = 1; i <= a; i++){
	    for (int j = 1; j <= a - i; j++){
	        System.out.print(" ");
	    }
	    for (int k = 1; k <= i; k++){
	        System.out.print("* ");
	    }
	    System.out.println();
	}

	for (int i = a-1; i >= 1; i--){
            for (int j = 1; j <= a - i; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
     	    System.out.println();
	}

    }
}
