package Practice.Loops;

public class Loops_Intro {
    public static void main(String[] args) {
        // While Loops
//        Print the first 10 number
//        int i=1;
//        while(i<=10){
//            System.out.print(i +" ");
//            i++;
//        }

//          For loops
//        The advantage of a loop is we know exactly
//        how many times the loop will execute even before the actual loop starts executing.

//        for (int i=0;i<=10;i++){
//            System.out.print(i+" ");
//        }
        // Omitting parts of for loops
        // init-statmeny parts omitted
//        int index=0;
//        for (;index<10;index++){
//            System.out.print(index+" ");
//        }

//        condition-statment parts omitted
//        for (int index=0; ;index++){
//            if(index<5){
//                System.out.print(index+" ");
//                if (index==5){
//                    break;
//                }
//            }
//        }

        // increment operator omitted
//        for (int index=0; index<=5;){
//            System.out.print(index+ " ");
//            index=index+1;
//        }

//        for (int i=0 , j=14; i<10 && j>5; i++ , j--){
//            System.out.print(i+" ");
//            System.out.println( );
//            System.out.print(j+" ");
//        }

//        do-statement
//        The loop is executed at least once before the condition is checked.
//           int idx=1;
//           do{
//               System.out.println(idx+" ");
//            idx=idx+1;
//           }while (idx <5);


//        Break Keyword
//        for (int i=1;i<=3;i++){
//            for (int j=1;j<=3;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        with break
//        for (int i=1; i<=3;i++){
//            for (int j=1;j<=3;j++){
//                System.out.print(j+" ");
//                if (i==j) break;
//            }
//            System.out.println();
//        }

        // Continue Keyword
//        for (int i=1; i<=5 ;i++){
//            if (i==3) continue;
//            System.out.println(i+" ");
//        }

        // Using Labels with continue and break keywords

        first:for (int i=0; i<3;i++){
            for (int j=0; j<3;j++){
                if (i==1 && j==1)
                    continue first ;
                System.out.println(i+" "+j);
            }
        }
    }
}
