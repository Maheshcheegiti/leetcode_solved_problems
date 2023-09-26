class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
           sum += (((i+1)*(arr.length-i)+1)/2)*arr[i];
        }
        return sum;
    }
}

/* Approach is we are going to add how many each numbers presents in total oddSubArrays then we are going multiply and add them
consider [1,4,2,5,3]
here lets consider for 1
1 appears in [1] , [1,4] , [1,4,2] , [1,4,2,5], [1,4,2,5,3] it appears in 5 times in total sub arrays for even 2 and odd 3
lets go for all in the below table by considering length 
length      even      odd      total
  1          0         1         1          explaination: [1] for this we only one odd array
  2          1         1         2                      : [1,4] for this [1] and [1,4]
  3          1         2         3                      : [1,4,5] for this [1] , [1,4] and [1,4,5]
  4          2         2         4
observe the pattern  :
  by using total we can get the no of even and odd sub array
    for even: total/2
        odd:  (total+1)/2
  then we can easily do our sum by no.of.odds*value
how to find total
[1,4,2,5,3]
consider from middle index let use assume our i is at middle that is at value 2,
from them we can genrate sum arrays from both left and right after m as left and n as right then m*n as total ways to generate subarrays
left(m): from 2 we can get [2],[2,4],[2,4,1] so 3 we can say index+1 so (i+1)
right(n): from 2 we can get [2,5],[2,5,3] and for the total array [1,4,2,5,3] here also middle index included so (4-2)+1 means 
(lastindex-currrentindex)+1 we can write it as (n-1-i+1) means (n-i) times
so total is (i+1)*(n-i) times by substuting in above even or odd we can get our answer 
*/
