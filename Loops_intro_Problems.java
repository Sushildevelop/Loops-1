package Practice.Loops;

public class Loops_intro_Problems {
    public static void main(String[] args) {
        // Count number
//        int n=123;
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n/10;
//        }
//        System.out.println(count);

        // Sum of digits
//        int n=123;
//        int sum=0;
//        while(n>0){
//            sum+=(n%10);
//            n/=10;
//        }
//        System.out.println(sum);

        // Reverse the digits of a number
//        int n=123;
//        int ans=0;
//        while(n>0){
//            int reminder=n%10;
//            ans=ans*10+reminder;
//            n/=10;
//        }
//        System.out.println(ans);

        // sum of series
//        int n=5;
//        int ans=0;
//        for (int i=0;i<=n;i++){
//            if (i%2==0)
//                ans=ans+i;
//        }
//        System.out.println(ans);

        // Given 2 numbers a and B . find a raise to the power b.

//        int a=3 , b=5;
//        int ans=1;
//        for (int i=1;i<=b;i++){
//            ans=ans*a;
//        }
//        System.out.println(ans);

        // Factorial Program
        int n=5;
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
