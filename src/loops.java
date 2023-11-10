import java.util.*;

public class loops {
    public static void main(String[] args) {

        // counter ++ => counter= counter +1
//         for (int counter=0 ; counter<11; counter++){
//             System.out.println(counter +"");

//             for (int i=0 ; i<11; i++){
//                 System.out.println(" counter " + i +" value = " + i);
//
//
//             }
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();

      int  sum= 0;
      for (int i=0; i<=n;i++){
          sum = sum +i;
      }
         System.out.println(sum);



    }
}
