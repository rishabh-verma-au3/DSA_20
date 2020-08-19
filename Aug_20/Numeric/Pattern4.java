// 4. Diamond Pattern Program in Java




import java.util.Scanner;
 
public class Pattern4
{            
    public static void main(String[] args) {
          
         Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
            

           for (int i = 0; i < n; i++) {
            
            System.out.printf("%" + (n - i) + "s", "");
            

            for(int j=i;j>=0;j--){
                  System.out.print(""+(j+1));
            }
            
            for(int j=1;j<(i+1);j++){
                System.out.print(""+(j+1));
          }

            System.out.println();
        }

        for (int i = n-2; i >=0; i--) {
            
            System.out.printf("%" + (n - i) + "s", "");
            

            for(int j=i;j>=0;j--){
                  System.out.print(""+(j+1));
            }
            
            for(int j=1;j<(i+1);j++){
                System.out.print(""+(j+1));
          }

            System.out.println();
        }
  
    }
  
}