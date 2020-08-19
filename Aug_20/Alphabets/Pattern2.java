// 2. Alphabet/ Character Pattern Programs



import java.util.*;


class Pattern2{

    public static void main(String[] args){

           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           int n=sc.nextInt();
           

            
           for(int i=0;i<n;i++){
                  for(int j=0;j<=i;j++){
                      System.out.print(""+(char)(65+i)+" ");
                  }

                  System.out.println();
           }




    }
}




