package Practice.Loops;

public class Triangular_Pattern {
    public static void main(String[] args) {
        // Increasing order Triangular pattern
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Decreasing order Trinagular pattern

//        int n=4;
//        for (int i=n;i>=1;i--){
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // triangle pattern

        int n=4;
        for (int i=1; i<=n;i++){
            // print r-i spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // print 2*i-1;
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
