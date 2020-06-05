import java.lang.*;
import java.util.*;
class FindDuplicate
{
    static Scanner input=new Scanner(System.in);
	static int arr[];
	public static void main(String args[])
	{
	    int temp=-1;
	    System.out.print("\nEnter the limit for the array:");
		int n=FindDuplicate.input.nextInt();
		arr=new int[n];
	    for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter element "+(i+1)+" : ");
			arr[i]=FindDuplicate.input.nextInt();
		}
		FindDuplicate.Sort(n);
		System.out.println("\nElements you entered are..");
		for(int i=0;i<n;i++)
		{
			System.out.println("\nElement "+(i+1)+" : "+(arr[i]));
		}
		System.out.println("\n****************Duplicate elements********************");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					if(temp!=arr[i])
					{
					    temp=arr[i];
				        System.out.println("\nDuplicate element: "+arr[i]);
					}
				}
			}
		}
		System.out.println("\n**********************************************************");
	}
    static void Sort(int n)
	{
	    int temp;
		for(int i=0;i<(n-1);i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{ 
				    temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}