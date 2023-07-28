package Practice.Loops;

import java.util.Scanner;

public class Rectangular_pattern {
    public static void main(String[] args) {
        // print a rectangular pattern
//        int n=7;
//        for (int i=1;i<n+1;i++){
//            for (int j=i; j<n+1;j++){
//                System.out.print(j+" ");
//            }
//           for (int k=1;k<i;k++){
//               System.out.print(k+" ");
//
//           }
//            System.out.println();
//        }

        // print a rectangular pattern
//        int n=4;
//        int m=6;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if (i==1  || i==n  || j==1|| j==m)
//                    System.out.print(j);
//                else
//                    System.out.print(" ");
//
//            }
//            System.out.println();
//        }


        //  Number pattern
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }


    }
}
