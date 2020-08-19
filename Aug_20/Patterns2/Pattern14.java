// 14. Down triangle



import java.util.*;




class Pattern14{

        public static void main(String[] args){
                   

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the n : ");
            int n=sc.nextInt();

                   for(int i=0;i<n;i++){
                         
                         for(int j=0;j<i;j++){
                             System.out.print(" ");
                         }
                         for(int j=0;j<2*(n-i)-1;j++){
                               if(i==0 || i==n-1){
                                System.out.print("*");
                                continue;
                               }

                             if(j==0 || j==2*(n-i)-3){
                                System.out.print("*");
                             }
                             System.out.print(" ");
                            
                         }

                        System.out.println();

                   }

        }


}