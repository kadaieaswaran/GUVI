import java.util.*;
public class FirstDublicate {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input count:");
		int n=sc.nextInt(),i,j;
		int[] num=new int[n];
		if( n > 0)
		{
		for(i=0;i<n;i++)
			num[i]=sc.nextInt();
		aa:
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				if(num[i]==num[j])
				{
				System.out.println(num[i]);
				break aa;
				}
			}
		}
		}
		else
			System.out.println("Incorrect input range!");
		sc.close();
	}	
}
		
