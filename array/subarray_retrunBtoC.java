package array;

public class subarray_retrunBtoC {
    public int[] solve(int[] A, int B, int C) {
        int [] N = new int[C - B + 1];
        int j = 0;
        for(int i = B; i<=C; i++) {
            N[j] = A[i];
            j++;
        }
        return N;
    }
}
