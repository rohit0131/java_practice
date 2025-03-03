import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//here we use binomial coefficient formula
//combination formulas
//nCr= n!/(n-r)!*r!



public class NCRFormula {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;

    }

    public static int bino(int n,int r){
        int N_Fact=fact(n);
        int R_Fact=fact(r);
        int NMR_Fact=fact(n-r);
        int binocoff=N_Fact /(R_Fact*NMR_Fact);
        return binocoff ;
    }

    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the value of N :");
//        int n=sc.nextInt();
//        System.out.println("Enter the value of R :");
//        int r=sc.nextInt();
//
//
//        System.out.println("ans of formulas "+bino(n,r))

//   <----------------------------------------------------------->
//       <---  prime no code ---> :)

//         Logic is
//         if the no. divisible by only 1 and itself no. then it is
//         use count : count is 2 only

//   <----------------------------------------------------------->


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the no to check no is prime of not ");
//        int n=sc.nextInt();
//
//        int  count =0;
//        for(int i=1; i<=n;i++){
//
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==2){
//
//            System.out.println("The given number is prime ");
//        } else{
//            System.out.println("the count is "+count);
//            System.out.println("The given number is not a prime ");
//        }


       

    }
}
