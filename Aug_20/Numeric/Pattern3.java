// 3. Pascal’s Triangle Program in Java

//importsnt way

import java.util.Scanner;
 
public class Pattern3
{            
    public static void main(String[] args) {
          
         Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
  
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
  
}