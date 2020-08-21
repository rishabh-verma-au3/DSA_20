// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.



// ##Method1(using temp array)


// class R1{
//      static void rotate(int arr[],int d,int n){

//             int ar1[]=new int[d];
            
//             for(int i=0;i<d;i++){
//                 ar1[i]=arr[i];
//             }
            
//             for(int i=0;i<n-d;i++){
//                 arr[i]=arr[i+d];
//             }
  
//             for(int i=0;i<d;i++){
//                 arr[n-d+i]=ar1[i];
//             }
            

//            for(int i=0;i<n;i++){
//                System.out.println(""+arr[i]);
//            }
//     }


//     public static void main(String[] args){
            
//              int arr[]={1,2,3,4,5,6};



//             R1.rotate(arr,2,6);

//     }
// }


// Time complexity : O(n)
// Auxiliary Space : O(d)



//Method 2: Rotate one by one


// class R1{

//        static void leftRotate(int arr[],int d,int n){

//               for(int i=0;i<d;i++){
                 
//                   for(int j=0;j<n-1;j++){
//                       int a=arr[j];
//                       arr[j]=arr[j+1];
//                       arr[j+1]=a;
//                   }
//               }
        
//              for(int i=0;i<n;i++){
//                  System.out.println(""+arr[i]);
//              }

//        }

//     public static void main(String[] args) {
            
//             int[] arr={1,2,3,4,5,6};

//             R1.leftRotate(arr,2,6);
//     }
// }

// // Time complexity : O(n * d)
// // Auxiliary Space : O(1)


//Method 3: Juggling Algorithm


class R1{

    static void leftRotate(int arr[],int d,int n){

           d=d%n;
           //to handle if d > n

           int i,j,k, temp;

           int gc=R1.gcd(d,n);
            // System.out.println(""+gc);
            
            for(i=0;i<gc;i++){
                temp=arr[i];
                j=i;
                
                while(true){
                    k=j+d;
                    if(k>=n){
                        k=k-n;
                    }
                    if(k==i){
                        break;
                    }

                    arr[j]=arr[k];
                    j=k;
                   // System.out.print(""+j);
                }

                arr[j]=temp;

            }

              
              for(i=0;i<n;i++){
                  System.out.println(""+arr[i]);
              }
          



    }

    public static int gcd(int d,int n){
          if(n==0){
              return d;

          }
          else{
              return gcd(n,d%n);
          }
    }

    public static void main(String[] args) {
         
                int arr[]={1,2,3,4,5,6,7};

                R1.leftRotate(arr,3,7);

    }

}


// Time complexity : O(n)
// Auxiliary Space : O(1)