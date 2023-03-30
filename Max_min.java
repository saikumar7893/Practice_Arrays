import java.util.*;
class Max_min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float sum=0;
        int count=0;
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array Elemeents");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            count++;
        }
        System.out.println("max Element is"+max);
        System.out.println("min Element is"+min);
        System.out.println("Average of elements is"+(sum)/n);
        System.out.println("count is"+count);
    }
}
