// Given an array, cyclically rotate the array clockwise by one.



class R4{
  
  public static void shift(int arr[],int n){

        int temp,top;
         
        top=arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
            
        }

        arr[0]=top;


        for(int i=0;i<n;i++){
            System.out.println(""+arr[i]);
        }

  }

  public static void main(String args[]) {
           int arr[]={1,2,3,4,5};

           R4.shift(arr,5);
  }

}

// Time Complexity: O(n) As we need to iterate through all the elements
// Auxiliary Space: O(1)