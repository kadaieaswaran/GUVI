import java.util.*;
public class FindTotalcount {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,sum,t,m,count,achieve=0;
		System.out.println("Enter the array ip count:");
		n=sc.nextInt();
		int[] A=new int[n];
		System.out.println("Enter the "+n+" numbers one-by-one:");
		for(i=0;i<n;i++)
			A[i]=sc.nextInt();
		System.out.println("Enter the sum count(m value):");
		m=sc.nextInt();
		System.out.println("Enter the total value(t value):");
		t=sc.nextInt();
	
		ab:
		for(i=0;i<n;i++)
		{
			for(int k=i+1;k<n;k++)
			{
			sum=A[i];
			count=1;
		for(j=k;j<n;j++)
		{
			if(count<=m&&(sum+A[j])<=t)
			{
				sum+=A[j];
				count+=1;
			}
			if(sum==t&&count==m)
			{
				System.out.print("TRUE");
				achieve=1;
				break ab;
			}
		}
			}
		}
		if(achieve==0)
			System.out.print("False");
		
	}	
}
		
