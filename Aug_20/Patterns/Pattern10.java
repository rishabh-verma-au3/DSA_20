// 10. Left  Triangle Pascal’s


import java.util.*;




class Pattern10{

        public static void main(String[] args){
               
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the n : ");
            int n=sc.nextInt();
              

             for(int i=0;i<n;i++){
                 for(int j=0;j<n-i-1;j++){
                     System.out.print(" ");
                 }
                 for(int j=0;j<=i;j++){
                     System.out.print("*");
                 }
                 System.out.println();
             }


               for(int i=1;i<n;i++){
                   for(int j=1;j<=i;j++){
                       System.out.print(" ");
                   }
                   for(int j=i;j<n;j++){
                       System.out.print("*");
                   }
                   System.out.println();
               }

                   
        }


}