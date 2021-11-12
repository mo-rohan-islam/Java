public class ReturnArray
{
	public static void main(String [] args)
	{
		char[] c;
		c = vowel();

		System.out.println("Array Output: \n");
		for (int i=0; i<c.length; i++)
			System.out.println(c[i]);
	}

	public static char[] vowel()
	{
		char[] aeiou = {'a','e','i','o','u'};
		return aeiou;
	}
}