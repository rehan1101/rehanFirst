import java.sql.SQLOutput;

public class advanceLoops {
    public static void main(String[] args) {


//        Print the pattern
    /*    *****
          *****
          *****
          *****
      */

//        for(int i=1; i<=4;i++){
//            for (int j =1; j<5; j++){
//                System.out.print("*");
//            }
//
//            System.out.println("*");
//
//        }


//          print the pattern

        /*
        *****
        *   *
        *   *
        *****
       */

//        outer loop
//        int n =4; int m =5 ;
//      for (int i=1; i<=n;i++){
//          for (int j=1; j<=m;j++){
//              if (i==1 || i==n || j==1 || j==m ){
//                  System.out.print("*");
//              } else{
//                  System.out.print(" ");
//              }
//          }
//          System.out.println("    ");
//      }
//

//
//---------------------------------------------------------------------------------------------------------------


//        *
//        * *
//        * * *
//        * * * *
//
       int n= 4;
//
//        for(int i =1; i<=n; i++){
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            } System.out.println();
//        }


//        *****
//        ****
//        ***
//        **
//        *


//        for (int i=n ; i >=1 ;i-- ){
//            for(int j =1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//            *
//           **
//          ***
//         ****
//        *****

//        outer loop
        for (int i=1; i<=n;i++){
//            inner loop ->space print
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop- star print
            for(int j=1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

        }









    }
}
