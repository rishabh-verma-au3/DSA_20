// 5. Diamond Pattern in Java






import java.util.*;


class Pattern5{

    public static void main(String[] args){

           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the n : ");
           String Str=sc.nextLine();
           char c=Str.charAt(0);

           int n=(int)c-64;

            for(int i=0;i<n;i++){
                 for(int j=0;j<n-i;j++){
                     System.out.print(" ");
                 }
                 for(int j=0;j<((2*i)+1);j++){
                     if(j==0 || j==((2*i)) ){
                         System.out.print(""+((char)(65+i)));
                     }
                     else{
                         System.out.print(" ");
                     }
                 }


                System.out.println();
            }

            for(int i=0;i<n-1;i++){
                 for(int j=0;j<=i+1;j++){
                     System.out.print(" ");
                 }
                 for(int j=0;j<((2*(n-i)));j++){
                     if(j==0 || j==((2*(n-i-2))) ){
                         System.out.print(""+((char)(65+n-i-2)));
                     }
                     else{
                         System.out.print(" ");
                     }
                 }


                System.out.println();
            }
       
              


    }
}