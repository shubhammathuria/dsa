//how to calculate nCr in java
import java.util.*;

public class nCr {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("input n and r");
        int N = scn.nextInt();
        int R = scn.nextInt();

        // calculate N!
        int nf = 1;
        for (int i = 1; i <= N; i++) {
            nf = nf * i;
        }
        //calculate R!
        int rf = 1;
        for (int i = 1; i <= R; i++) {
            rf = rf * i;
        }
        // calculate (N-R)!;
        int nrf = 1;
        for (int i = 1; i <= N - R; i++) {
            nrf = nrf * i;
        }
        // calculate nCr
        System.out.println(nf / (rf * nrf));

    
    }
}
