public class Pattern {
    public static void main(String[] args){
//        <---------------------------------------------------------------------------->
           //    *
           //    **
           //    * *
           //    *  *
           //    *****
//        <---------------------------------------------------------------------------->


//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                if(j==i||j==0||i==4){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//
//            }
//            System.out.println();
//        }
//
//       <---------------------------------------------------------------------------->
//        15 14 13 12 11
//        10 9 8 7
//        6 5 4
//        3 2
//        1
//       <---------------------------------------------------------------------------->


//        int j,no=15;
//        for(int i=5;i>=1;i--){
//           for( j=1;j<=i;j++) {
//               System.out.print(no +" ");
//               no--;
//           }
//
//            System.out.println();
//           }
//

//        <---------------------------------------------------------------------------->
//            1
//            0 1
//            1 0 1
//            0 1 0 1
//            1 0 1 0 1
//        <---------------------------------------------------------------------------->
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             if((i+j)%2==0){
//                 System.out.print("1");
//             }else{
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }

//        <---------------------------------------------------------------------------->
//       *
//       *
//       *
//     *****
//       *
//       *
//       *
//        <---------------------------------------------------------------------------->

//        for( int i=1;i<=5;i++){
//
//            for(int j=1;j<=5;j++){
//
//                if(i==5||j==5) {
//                    System.out.print("*");
//                    if(i==5&&j!=5){
//                        System.out.print("*");
//                    }
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//        for(int i=1;i<5;i++) {
//            for (int j = 1; j <= 5; j++) {
//
//                if (j == 5)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


//       <---------------------------------------------------------------------------->
//              ******
//              *1234*
//              *1234*
//              *1234*
//              *1234*
//              ******
//       <---------------------------------------------------------------------------->
//        int no=1;
//        for(int i=1;i<=6;i++){
//            for(int j=1;j<=6;j++){
//                if(i==1||i==6||j==1||j==6){
//                    System.out.print("*");
//                }
//                else{
//                    if(j<6){
//                        System.out.print(j-1);
//                    }
//                }
//            }
//            System.out.println();
//        }
//
//
//       <---------------------------------------------------------------------------->

//       <---------------------------------------------------------------------------->
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }}
