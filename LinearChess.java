import java.util.*;

class linchess {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int min = 100000001, ans = 0, p = -1;
                for (int i = 0; i < n; i++) {
                    if (k % arr[i] == 0) {
                        ans = k / arr[i];
                        if (ans < min) {
                            min = ans;
                            p = arr[i];
                        }
                    }
                }
                System.out.println(p);
            }
            sc.close();
        } catch (Exception e) {
        }
    }
}