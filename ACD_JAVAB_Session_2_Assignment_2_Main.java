package session2;

public class ACD_JAVAB_Session_2_Assignment_2_Main
{
	public static void main(String[] args) 
	{
		int i,j,k;
		String prime = "";
		
		for (i = 1; i <= 100; i++)
		{
			k = 0;
			for (j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
				prime = prime + " " + i;
		}
		System.out.println("Prime numbers between 1 and 100");
		System.out.println(prime);
	}
}
/* OUTPUT
 Prime numbers between 1 and 100
 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/
