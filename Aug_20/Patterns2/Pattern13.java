// 13. Triangle Star pattern


import java.util.*;




class Pattern13{

        public static void main(String[] args){
                
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the n : ");
            int n=sc.nextInt();


              for(int i=0;i<n;i++){
                   for(int j=0;j<n-i;j++){
                          System.out.print(" ");
                   }
                   if(i==0){
                       System.out.println("*");
                       continue;
                   }
                   if(i==n-1){
                    for(int j=0;j<2*n-1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    continue;
                }
                   for(int j=0;j<((2*i)+1);j++){
                       if(j==0 || j==((2*i))){
                           System.out.print("*");
                       }
                       else{
                           System.out.print(" ");
                       }
                   }
                   System.out.println();
              }



        }


}