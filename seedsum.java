import java.util.*;
class seedsum {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n,k,temp,sum,i;
	n=sc.nextInt();
	if(n>0)
	{
	  for(i=10;i<n;i++)
	  {
	  	sum=1;
	  	k=i;
	  	while(k!=0)
	  	{
	  		temp=k%10;
	  		sum=sum*temp;
	  		k=k/10;
	  	}
	  	sum=sum*i;
	  	if(sum==n)
	  		System.out.println(i+" is the seed of "+n);
	  }
	}
	  else
	    System.out.println("-1");
	
}
}
