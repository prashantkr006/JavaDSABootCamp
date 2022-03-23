package EasyProblems;
import java.util.*;

class Solution{

    // Function that counts the pairs whose
// Bitwise XOR is greater than both
// the elements of pair
    static void countPairs(int[] A, int N)
    {

        // Stores the count of pairs
        int count = 0;

        // Generate all possible pairs
        for(int i = 0; i < N; i++)
        {
            for(int j = i + 1; j < N; j++)
            {

                // Find the Bitwise XOR
                int xo = (A[i] ^ A[j]);
                if (xo > A[i])
                {
                    count++;
                }
            }
        }

        // Print the value of count
        System.out.println(count);
    }

    // Driver Code
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Function Call
            countPairs(arr, n);
        }
    }
}

// This code is contributed by akhilsaini
