import java.util.*;
import java.lang.*;
import java.io.*;

class TRACE {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[][] = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = sc.nextInt();
                    }
                }
                int sum[][] = new int[n][n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        int num = 0;
                        if (j > 0 && k > 0)
                            num += sum[j - 1][k - 1];
                        num += arr[j][k];
                        sum[j][k] = num;
                    }
                }

                int max = 0;
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, sum[j][n - 1]);
                }
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, sum[n - 1][j]);
                }

                System.out.println(max);
                sc.close();
            }
        } catch (Exception e) {
        }
    }

}
