import java.util.Scanner;

public class subbarr {
	public static void main(String args[])
	{
		int ar1[]= {24,72,81,43,89,79};
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int ar2[]=new int[n];
		int c=0;
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			ar2[i]=sc.nextInt();
		}
		for(int k=0;k<6;k++)
		{
			if(ar2[j]==ar1[k])
			{
				c++;
				j++;
			}
		}
		if(c==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
