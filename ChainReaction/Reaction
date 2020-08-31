import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int row = sc.nextInt();
                int col = sc.nextInt();
                int[][] grid = new int[row][col];
                int state = 0;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        int count = 0;
                        grid[i][j] = sc.nextInt();
                    
                        if(i+1<row)
                            count++;
                        if(i-1>=0)
                            count++;
                        if(j+1<col)
                            count++;
                        if(j-1>=0)
                            count++;
                        if(count<=grid[i][j])
                            state=1;
                    }
                }
            if (state == 0) 
                System.out.println("Stable");
            else 
                System.out.println("Unstable");
        	}
		}catch (Exception e){}
	}
}
