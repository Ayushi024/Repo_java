import java.util.Scanner;
public class Grades {
public static void main(String args[]){
int[] arr=new int[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements you want to store: "); 
int n=sc.nextInt(); 
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();}
for(int i=0;i<n;i++)
{
for(int j=i+1;i<n;i++)
{
if(arr[i]<arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
if(arr[i]>=40 && arr[i]<=50)
{
System.out.println("PASS" + arr[i]);
}
else if(arr[i]>=51 && arr[i]<=75)
{
System.out.println("MERIT" + arr[i]);
}
if(arr[i]>75)
{
System.out.println("DISTINCTION" + arr[i]);
}
}
}
}
