package Practice.Loops;

public class Numerical_Triangular_Pattern {
    public static void main(String[] args) {
        // triangular pattern
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // triangular pattern
//        int n=4;
//        for (int i=1;i<=n;i++){
//            // print n-i spaces
//            for (int j=1;j<n-i;j++){
//                System.out.print(" ");
//            }
//            //print 1 to i
//            for (int k=1;k<=i;k++){
//                System.out.print(k);
//            }
//            // print i-1 to 1
//            for (int l=i-1;l>=1;l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

        // print a
//        1
//       2 2
//       3  3
//      4    4
        int i , j, k;
        int row=4;
        for (i=row+1;i>1;i--)
        {
           for ( j=i;j>2;j--)
           {
               System.out.print(" ");
           }
           for ( k=1;k<=row-i+1;k++)
           {
               if(k==1){
                   System.out.print(row-i+2);
               }
               else{
                   System.out.print(" ");
               }
           }
           for (int m=k;m>=1;m--){
               if (m==1){
                   System.out.print(row-i+2);
               }
               else{
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
    }
}
