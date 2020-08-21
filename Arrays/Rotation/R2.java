// Reversal algorithm for array rotation



// Method 4 (The Reversal Algorithm) :


class R2{


     static void leftRotate(int[] arr,int d) {
                          
                          if(d==0)
                            return ;

                         int n=arr.length;


                        R2.reverse(arr,0,d-1);
                        R2.reverse(arr,d,n-1);
                        R2.reverse(arr,0,n-1);

                        for(int i=0;i<n;i++){
                            System.out.println(""+arr[i]);
                        }
    }


    static void reverse(int[] arr,int l,int h){
                int temp;
              while(l<h){
                    temp=arr[l];
                    arr[l]=arr[h];
                    arr[h]=temp;
                    l++;
                    h--;
              }

    }

    public static void main(String[] args) {
              int[] arr={1,2,3,4,5,6,7};

              R2.leftRotate(arr,2);
    }
}


// Time Complexity : O(n)