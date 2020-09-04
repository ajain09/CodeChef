import java.util.*;

public class hrdseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && t <= 128) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 0;
            int count = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == arr[i]) {
                        arr[i + 1] = i - j;
                        break;
                    }
                    if (j == 0 && arr[i] != 0) {
                        arr[i + 1] = 0;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] == arr[n - 1]) {
                    count++;
                }
            }
            System.out.println(count);
            t--;
            sc.close();
        }
    }
}
