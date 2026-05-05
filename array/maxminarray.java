package array;

public class maxminarray {
    public int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++) {
            if(A[i]> max) {
                max= A[i];
            }
            if(A[i]< min) {
                min = A[i];
            }
        }
        return max+min;
    }
}


