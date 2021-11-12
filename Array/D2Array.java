public class D2Array
{
	public static void main(String[] args)
	{
		int[][] d2arr = {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println();
		for(int i=0; i<d2arr.length; i++)
		{
			for(int j=0; j<d2arr[i].length; j++)
				System.out.print(d2arr[i][j] + "\t");
			System.out.println();
			System.out.println();
		}
		System.out.println();
	}
}