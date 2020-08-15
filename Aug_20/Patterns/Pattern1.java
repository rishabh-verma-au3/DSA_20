
// 1. Pyramid Program

//https://www.edureka.co/blog/30-pattern-programs-in-java/


import java.util.*;


class Pattern1{

    public static void main(String[] args){

           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();

           for(int i=0;i<n;i++){
               for(int j=0;j<n-i;j++){
                   System.out.print(" ");
               }
               for(int j=0;j<=i;j++){
                   System.out.print("* ");
               }
               System.out.println();
           }




    }
}



