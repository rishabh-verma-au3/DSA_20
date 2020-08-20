// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.



// ##Method1


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