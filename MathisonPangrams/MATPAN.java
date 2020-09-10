import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int a[] = new int[26];
                for (int i = 0; i < 26; i++) {
                    a[i] = sc.nextInt();
                }
                String s = sc.next();
                s.toLowerCase();
                int count = 0;
                for (int i = 0; i < 26; i++) {
                    int ascii = i + 97;
                    char c = (char) ascii;
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == c) {
                            break;
                        } else if (j == s.length() - 1 && s.charAt(j) != c) {
                            count = count + a[i];
                        } else {
                            continue;
                        }
                    }
                }
                System.out.println(count);
                t--;
            }
            sc.close();
		}catch(Exception e){}
    }
}
