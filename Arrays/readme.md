Advantages of using arrays:

Arrays allow random access of elements. This makes accessing elements by position faster.
Arrays have better cache locality that can make a pretty big difference in performance


Usually, an array of characters is called a ‘string’, whereas an array of ints or floats is called simply an array.


METHOD 3 (A Juggling Algorithm)
This is an extension of method 2. Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.


Method 4 (The Reversal Algorithm) :

Algorithm :

rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);
Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is :

Reverse A to get ArB, where Ar is reverse of A.
Reverse B to get ArBr, where Br is reverse of B.
Reverse all to get (ArBr) r = BA.


Block swap algorithm for array rotation

Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   b)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them.




Given an array, cyclically rotate the array clockwise by one.


Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.