import java.lang.*;
import java.util.*;
class findMaximum
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter the limit for the array:");
        int n=input.nextInt();
        int arr[]=new int[n]; 
        getInput(arr,n,input);
        putInput(arr,n);
        findmaximum(arr,n);
    }
    static void getInput(int arr[],int n,Scanner input)
    {
        System.out.println("please enter the values for the array:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=input.nextInt();
            System.out.println();
        }
    }
    static void putInput(int arr[],int n)
    {
        System.out.println("The elements you entered is ....");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element "+(i+1)+" : "+arr[i]);
            System.out.println();
        }
    }
    static void findmaximum(int arr[],int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("****************************************************\n");
        System.out.println("Maximum Element: "+max);
        System.out.println("\n****************************************************");
    }
}