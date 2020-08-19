// 2. Number Pattern Program in java





import java.util.*;




class Pattern2{

        public static void main(String[] args){
            
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
                 int t=0;
                 for(int i=1;i<=n;i++){
                       
                     for(int j=1;j<=i;j++){
                         System.out.print(""+(t+j)+" ");
                         
                     }
                      t=t+i;
                     System.out.println();
                 }

        }


}