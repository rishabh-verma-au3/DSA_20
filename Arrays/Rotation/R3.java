// Block swap algorithm for array rotation


// class R3{

//         public static void leftRotate(int arr[],int d,int n) {                       
//                         R3.RotateRec(arr,0,d,n);
//                         for(int i=0;i<n;i++){
//                             System.out.println(""+arr[i]);
//                         }
//         }

//         public static void RotateRec(int[] arr,int i,int d,int n){
                    
//                     if(d==0 || d==n){
//                         return;
//                     }

//                     if(d==n-d){
//                         swap(arr,i,n-d+i,d);
//                         return;
//                     }
//                     if(d<n-d){
//                         swap(arr,i,n-d+i,d);
//                         R3.RotateRec(arr,i,d,n-d);
//                     }
//                     else{
//                          swap(arr,i,d,n-d);
//                          R3.RotateRec(arr,n-d+i,2*d-n,d);
//                     }
//         }
//        //swapping elements with indexs fi si wiith d elements
//         public static void swap(int arr[], int fi,int si,int d) {
//             int i,temp;

//             for(i=0;i<d;i++){
//                 temp=arr[fi+i];
//                 arr[fi+i]=arr[si+i];
//                 arr[si+i]=temp;
//             }
//         }


//         public static void main(String[] args) {

//             int[] arr={1,2,3,4,5,6,7,8,9};


//             R3.leftRotate(arr,3,9);
            
//         }
// }



class R3{



      public static void leftRotate(int arr[],int d,int n){
               int i,j;

               if(d==0 || d==n){
                   return;
               }

               i=d;
               j=n-d;

               while(i!=j){
                   if(i<j){
                       R3.swap(arr,d-i,d+j-i,i);
                       j-=i;
                   }
                   else{
                       R3.swap(arr,d-i,d,j);
                            i-=j;
                       
                   }

                  
               }
                R3.swap(arr,d-i,d,i);


                    //  for( i=0;i<n;i++){
                    //         System.out.println(""+arr[i]);
                    //     }
               
      }

     // swapping elements with indexs fi si wiith d elements
        public static void swap(int arr[], int fi,int si,int d) {
            int i,temp;

            for(i=0;i<d;i++){
                temp=arr[fi+i];
                arr[fi+i]=arr[si+i];
                arr[si+i]=temp;
            }
        }


    public static void main(String[] args){
                   int[] arr={1,2,3,4,5,6,7,8,9};


          R3.leftRotate(arr,3,9);
           for( int i=0;i<9;i++){
                            System.out.println(""+arr[i]);
                        }
    }
}

// Time Complexity: O(n)