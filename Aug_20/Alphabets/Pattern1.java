// 1. Right Alphabetic triangle 

import java.util.*;


class Pattern1{

    public static void main(String[] args){

           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
           

            
           for(int i=0;i<n;i++){
                  for(int j=0;j<=i;j++){
                      System.out.print(""+(char)(65+j)+" ");
                  }

                  System.out.println();
           }




    }
}



