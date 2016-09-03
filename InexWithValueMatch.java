import java.util.*;
public class InexWithValueMatch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input count:");
		int n=sc.nextInt(),i;
		int[] num=new int[n];
		if( n > 0)
		{
		for(i=0;i<n;i++)
			num[i]=sc.nextInt();
			for(i=0;i<n;i++)
			{
				if(num[i]==i)
					System.out.println(num[i]);
			}
	
		}
		else
			System.out.println("Incorrect input range!");
		sc.close();
	}	
}
		
