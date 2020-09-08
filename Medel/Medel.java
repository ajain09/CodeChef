import java.util.*;
import java.lang.*;
import java.io.*;

class Medel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
      Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while (t > 0) {
              int n = sc.nextInt();
              int[] arr = new int[n];
              int max = 0, imax = 0;
              int min = 110, imin = 0;
              for (int i = 0; i < n; i++) {
                  int a = sc.nextInt();
                  arr[i] = a;
                  if (a > max) {
                      max = a;
                      imax = i;
                  }
                  if (a < min) {
                      min = a;
                      imin = i;
                  }
              }
              if (imax > imin) {
                  System.out.println(min + " " + max);
              } else {
                  System.out.println(max + " " + min);
              }
              t--;
         }
         sc.close();
		  }catch(Exception e){}
	  }
}
