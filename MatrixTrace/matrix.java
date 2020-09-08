import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && t <= 100) {
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int l = 1; l < n; l++) {

                for (int row = 0; row < n - l; row++) {

                    for (int col = 0; col < n - l; col++) {
                        int j = col;
                        int i = row;
                        int sum = 0;
                        int count = 0;
                        while (count <= l) {
                            sum += arr[i][j];
                            i++;
                            j++;
                            count++;
                        }
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
            }
            System.out.println(max);
            t--;
            sc.close();
        }
    }
}