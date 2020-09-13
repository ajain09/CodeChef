import java.util.*;

class saferobo
{
	public static void main (String[] args) throws java.lang.Exception
	{
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String s = sc.next();
                int sa = sc.nextInt();
                int sb = sc.nextInt();
                int apos = s.indexOf("A");
                int bpos = s.indexOf("B");
                int res = 0;
                for (int j = apos; j < bpos; j++) {
                    if (apos < bpos) {
                        apos += sa;
                        bpos -= sb;
                    }
                    if (apos == bpos) {
                        res = 1;
                        break;
                    }
                }
                if (res == 1) {
                    System.out.println("unsafe");
                } else {
                    System.out.println("safe");
                }   
            }
            sc.close();
        }catch(Exception e){}
	}
}
