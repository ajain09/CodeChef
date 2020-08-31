import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  try{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test case
        while (t > 0 && t <= 2000) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = n+1;
            int max = 0;
            int count = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i > 0) {
                    if (arr[i] - arr[i - 1] <= 2)
                        count++;
                    else {
                        if (count < min)
                            min = count;
                        if (count > max)
                            max = count;
                        count = 1;
                    }
                }
            }
            if (count < min)
                min = count;
            if (count > max)
                max = count;
            System.out.println(min + " " + max);
            t--;
        }
        sc.close();	
        }catch(Exception e){}
	}
}
