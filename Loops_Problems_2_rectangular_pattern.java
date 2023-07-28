package Practice.Loops;

public class Loops_Problems_2_rectangular_pattern {
    public static void main(String[] args) {
//        Rectangular pattern
//        for (int i=1;i<=3;i++){
//            for (int j=1;j<=6;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Hollow Rectangular Pattern
//       int h=4;
//       int w=6;
//        for (int i=1;i<=h;i++){
//
//            for (int j=1;j<=w;j++){
//                if (i==1 || i==h|| j==1 || j==w)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//

        // Another rectangular pattern
        int h=4;
        int w=6;
        for (int i=1;i<=h;i++){
            for (int j=1; j<=w;j++){
                if (j%2==0){
                    System.out.print(".");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
