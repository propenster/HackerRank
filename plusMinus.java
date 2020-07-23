/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main{

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
      int arrSize = arr.length;
      int i;
       
      double sumPositive = 0;
      double sumNegative = 0;
      double sumZero = 0;

      for(i=0; i<arrSize; i++) {
       
      if(arr[i] > 0){
     sumPositive += 1;
}else if(arr[i]< 0){
  sumNegative += 1;
}else{
 sumZero += 1;
}

}


System.out.format("%.6f ", sumPositive/arrSize);
System.out.println();
System.out.format("%.6f ", sumNegative/arrSize);
System.out.println();
System.out.format("%.6f ", sumZero/arrSize);
System.out.println();


    }

    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
