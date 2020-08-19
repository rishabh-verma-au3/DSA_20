// 6. Descending order Pattern





import java.util.Scanner;
 
public class Pattern6
{            
    public static void main(String[] args) {
          
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
        
            for(int i=1;i<=n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print(""+(n-j)+" ");
                    }

                    System.out.println();
            }
        
        
        
        }
}