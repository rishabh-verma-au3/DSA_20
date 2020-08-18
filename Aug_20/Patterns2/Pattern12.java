
// 12. Alphabet A Pattern


import java.util.*;




class Pattern12{

        public static void main(String[] args){
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the n : ");
            int n=sc.nextInt();

                    for(int i=0;i<n;i++){
                      
                         if(i==0){
                             for(int j=0;j<Math.floor(n/2);j++){
                                 System.out.print(" ");
                         
                                 
                             }
                             System.out.print("*");
                             System.out.println();
                             continue;
                         }

                         if(i==(int)(n/2)){
                             for(int j=0;j<n;j++){
                                 System.out.print("*");
                             }
                             System.out.println();
                             continue;
                         }

                           for(int j=0;j<n;j++){
                               if(j==0 || j==n-1){
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