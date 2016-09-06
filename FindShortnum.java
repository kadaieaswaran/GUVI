import java.util.*;
public class FindShortnum {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n,k,temp,len;
	n=sc.nextInt();
	k=sc.nextInt();
	len=String.valueOf(n).length();
	int[] a=new int[len];
	int i=0;
	while(n!=0)
	{
		a[i]=n%10;
		i+=1;
		n=n/10;
	}
	Arrays.sort(a);
	for(i=0;i<(len-k);i++)
	{
		n=(n*10)+a[i];
	}
	System.out.print(n);
}
}
