// Number Pattern Programs in Java




import java.util.Scanner;
 
public class Pattern5
{            
    public static void main(String[] args) {
          
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
        
            for(int i=1;i<=n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print(""+i+" ");
                    }

                    System.out.println();
            }
        
        
        
        }
}