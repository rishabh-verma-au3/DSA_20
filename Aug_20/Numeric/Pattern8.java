// 8. Binary Number Pattern






import java.util.Scanner;
 
public class Pattern8
{            
    public static void main(String[] args) {
          
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
        
            
            for(int i=1;i<=n;i++){

                   if(i%2==0){
                        
                   for(int j=0;j<n;j++){
                         if(j%2==0){
                            System.out.print("0");
                         }
                         else{
                            System.out.print("1");
                         }
                      }
                   }
                   else{
                    for(int j=0;j<n;j++){
                        if(j%2==0){
                           System.out.print("1");
                        }
                        else{
                           System.out.print("0");
                        }
                     }


                   }

                

                   System.out.println();
            }
        
        
        
        }
}