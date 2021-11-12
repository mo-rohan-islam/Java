public class ArrayEx1
{
	public static void main(String [] args)
	{
		int i;
		int [] arr = new int[10];

		for ( i=0; i<10; i++)
		{
			arr[i] = i;
		}

		System.out.println("Array Output: \n");
		for ( i=0; i<10; i++)
			System.out.println(arr[i]+1);
	}
}