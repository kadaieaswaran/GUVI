import java.util.*;
public class RemoveDubChar {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		for(int i=0;i<l-1;i++)
		{
			char c=s.charAt(i);
			for(int j=i+1;j<l;j++)
			{
				while(j<l&&c==s.charAt(j))
				{
					s=s.substring(0,j)+s.substring(j+1);
					l-=1;
				}
			}
		}
		System.out.println(s);
	}	
}
		
