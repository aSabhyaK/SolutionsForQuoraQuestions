public class SubArrayAverage {

	public static void main(String[] args) {
		int rows = 3, columns = 3;
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int[][] b = new int[rows][columns];
		b[0][0] = a[0][0];
		
		for(int i = 0; i < rows; ++ i)
		{
			for(int j = 0; j < columns; ++ j)
			{
				if(i == 0 && j == 0)
					continue;
				
				else if(i == 0)
					b[i][j] = a[i][j] + b[i][j - 1];
				
				else if(j == 0)
					b[i][j] = a[i][j] + b[i - 1][j];
					
				else
					b[i][j] = a[i][j] + b[i - 1][j] - b[i - 1][j - 1] + b[i][j - 1];
			}
		}
		
		int top = 1, bottom = 2, left = 1, right = 2;
		int number = (right - left + 1) * (bottom - top + 1);
		
		int sum = b[bottom][right] + b[top - 1][left - 1] - b[top - 1][right] - b[bottom][left - 1];
		
		System.out.println(sum / number);
	}
}
