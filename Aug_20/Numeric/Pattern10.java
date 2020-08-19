// 10. Diamond Numeric Pattern
 





import java.util.Scanner;
 
public class Pattern10
{            
    public static void main(String[] args) {
          
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
        
            
           for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }



                for(int j=i+1;j<=n;j++){
                    System.out.print(""+j+" ");
                }
                System.out.println();
           }
        
           for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-2;j++){
                System.out.print(" ");
            }

            for(int j=n-i-1;j<=n;j++){
                System.out.print(""+j+" ");
            }
            System.out.println();
       }
    
        
        
        }
}