public class numberofpair {
     public long solve(String A) {
       long countA = 0;
        long ans = 0;

        for(int i = 0; i<A.length(); i++) {
            char ch = A.charAt(i);

            if (ch == 'A') {
                countA++;
            }

            else if (ch == 'G') {
                ans += countA;
            }

        }
        return ans;
    }
}


