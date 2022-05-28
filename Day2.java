//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
/**Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.**/


// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        int b=0;
        for (int i=0;i<array.length;i++)
        {
        if(array[i]!=i+1)
        {
            b= i+1;
            break;
        }
        
        }
        if(b==0)
        {
            b=n;
            
        }
        return b;// Your Code Here
    }
}


