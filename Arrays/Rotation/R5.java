// Search an element in a sorted and rotated array



// class R5{

      
//     public static int bSearch(int[] arr,int item){
//              int n=arr.length;
//             int pivot=R5.findPivot(arr,0,n-1);
//             System.out.println(""+pivot);
//             if(pivot==-1){
//                 return R5.binSearch(arr,0,n-1,item);
//             }
            
//             if(arr[pivot]==item){
//                 return pivot;
//             }
//             if(arr[0]<=item){
//                return  R5.binSearch(arr,0,pivot-1,item);
//             }
            
//             return  R5.binSearch(arr,pivot+1,n-1,item);


//     }
//     // 	static int pivotedBinarySearch(int arr[], int n, int key) 
// // 	{ 
// // 		int pivot = findPivot(arr, 0, n - 1); 

// // 		// If we didn't find a pivot, then 
// // 		// array is not rotated at all 
// // 		if (pivot == -1) 
// // 			return binarySearch(arr, 0, n - 1, key); 

// // 		// If we found a pivot, then first 
// // 		// compare with pivot and then 
// // 		// search in two subarrays around pivot 
// // 		if (arr[pivot] == key) 
// // 			return pivot; 
// // 		if (arr[0] <= key) 
// // 			return binarySearch(arr, 0, pivot - 1, key); 
// // 		return binarySearch(arr, pivot + 1, n - 1, key); 
// // 	} 


//      public static int findPivot(int arr[],int l,int h){
//         // if(h<l){
//         //     return -1;
//         // }
//         // if(h==l){
//         //     return l;
//         // } 
//         //   for(int i=l;i<=h;i++){
//         //       if(arr[i]>arr[i+1]){
//         //              return i;
//         //       }
//         //   }

//         //   return -1;

//          // base cases 
//          if (h < l) 
//          return -1; 
//          if (h == l) 
//          return l; 

//      /* low + (high - low)/2; */
//          int mid = (l + h) / 2; 
//      if (mid < h && arr[mid] > arr[mid + 1]) 
//          return mid; 
//      if (mid > l && arr[mid] < arr[mid - 1]) 
//          return (mid - 1); 
//      if (arr[l] >= arr[mid]) 
//          return findPivot(arr, l, mid - 1); 
//      return findPivot(arr, mid + 1, h); 


//      }

//      public static int binSearch(int[] arr,int l,int h,int key){
                  

//         if(h<l){
//             return -1;
//         }
//         int mid=(l+h)/2;
//         if(key==arr[mid]){
//             return mid;
//         }
//         if(key>arr[mid]){
//             return R5.binSearch(arr,(mid+1),h,key);
//         }
//         return R5.binSearch(arr,l,(mid-1),key);
    
//     } 

//     public static void main(String[] args) {
          
//                int[] arr={4,5,6,1,2,3};

//                int p=R5.bSearch(arr,6);
//                 if(p==-1){
//                     System.out.println(""+"nothing");
//                 }
//                 else{
//                     System.out.println("finds at"+(p));
//                 }



//     }
// 
// }


// Complexity Analysis:

// Time Complexity: O(log n).
// Binary Search requires log n comparisons to find the element. So time complexity is O(log n).
// Space Complexity:O(1), No extra space is required.


/* Java program to search an element 
in a sorted and pivoted array*/

// class R5 { 

// 	/* Searches an element key in a 
// 	pivoted sorted array arrp[] 
// 	of size n */
// 	static int pivotedBinarySearch(int arr[], int n, int key) 
// 	{ 
// 		int pivot = findPivot(arr, 0, n - 1); 

// 		// If we didn't find a pivot, then 
// 		// array is not rotated at all 
// 		if (pivot == -1) 
// 			return binarySearch(arr, 0, n - 1, key); 

// 		// If we found a pivot, then first 
// 		// compare with pivot and then 
// 		// search in two subarrays around pivot 
// 		if (arr[pivot] == key) 
// 			return pivot; 
// 		if (arr[0] <= key) 
// 			return binarySearch(arr, 0, pivot - 1, key); 
// 		return binarySearch(arr, pivot + 1, n - 1, key); 
// 	} 

// 	/* Function to get pivot. For array 
// 	3, 4, 5, 6, 1, 2 it returns 
// 	3 (index of 6) */
// 	static int findPivot(int arr[], int low, int high) 
// 	{ 
// 		// base cases 
// 		if (high < low) 
// 			return -1; 
// 		if (high == low) 
// 			return low; 

// 		/* low + (high - low)/2; */
// 		int mid = (low + high) / 2; 
// 		if (mid < high && arr[mid] > arr[mid + 1]) 
// 			return mid; 
// 		if (mid > low && arr[mid] < arr[mid - 1]) 
// 			return (mid - 1); 
// 		if (arr[low] >= arr[mid]) 
// 			return findPivot(arr, low, mid - 1); 
// 		return findPivot(arr, mid + 1, high); 
// 	} 

// 	/* Standard Binary Search function */
// 	static int binarySearch(int arr[], int low, int high, int key) 
// 	{ 
// 		if (high < low) 
// 			return -1; 

// 		/* low + (high - low)/2; */
// 		int mid = (low + high) / 2; 
// 		if (key == arr[mid]) 
// 			return mid; 
// 		if (key > arr[mid]) 
// 			return binarySearch(arr, (mid + 1), high, key); 
// 		return binarySearch(arr, low, (mid - 1), key); 
// 	} 


// 	// main function 
// 	public static void main(String args[]) 
// 	{ 
// 		// Let us search 3 in below array 
// 		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 }; 
// 		int n = arr1.length; 
// 		int key = 3; 
// 		System.out.println("Index of the element is : "
// 						+ pivotedBinarySearch(arr1, n, key)); 
// 	} 
// } 






class R5{




    static int Search(int[] arr,int l,int h,int item){
        if(l>h){
               return -1;
        }

        int mid=(l+h)/2;

        if(arr[mid]==item){
            return mid;
        }

        if(arr[l]<=arr[mid]){


            if(item>=arr[l] && item<=arr[mid]){
                 return Search(arr,l,mid-1,item);
            }

            return Search(arr,mid+1,h,item);
        }

        if(item >=arr[mid] && item<=arr[h]){
             return Search(arr,mid+1,h,item);
        }

        return Search(arr,l,mid-1,item);
    }



    public static void main(String args[]){

        int arr[]={3,4,5,6,1,2};

        int n=arr.length;

        int p=Search(arr,0,n-1,1);

        if(p==-1){
            System.out.println(""+p);
        }
        else{
            System.out.println(""+p);
        }
    }
}


// Time Complexity: O(log n).
// Binary Search requires log n comparisons to find the element. So time complexity is O(log n).
// Space Complexity: O(1).
// As no extra space is required.