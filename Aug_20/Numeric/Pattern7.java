//7. Right Triangle Numeric Pattern 





import java.util.Scanner;
 
public class Pattern7
{            
    public static void main(String[] args) {
          
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
        
            
            for(int i=1;i<=n;i++){
                   for(int j=i;j>0;j--){
                       System.out.print(""+j+" ");
                   }

                   System.out.println();
            }
        
        
        
        }
}