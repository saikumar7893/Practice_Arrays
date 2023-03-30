import java.util.*;
class Move1{
    public static void MoveOnes(int a[])
    {
        int count=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=1)
            {
                a[count]=a[i];
                count++;
            }
        }
        while(count<n)
        {
            a[count]=1;
            count++;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the n elements of an array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        MoveOnes(a);
        System.out.println("Array elements with 1's at last"+Arrays.toString(a));
       
    }
}