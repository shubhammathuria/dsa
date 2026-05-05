package array;
//Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

public class goodpair {
    public int solve(int[] A, int B) {
        int n = A.length;
        for(int i = 0;i<n;i++) {
            for(int j = i + 1;j<n; j++) {
                if(A[i]+ A[j]== B) {
                    return 1;
                }

            }
        }return 0;
    }
}


