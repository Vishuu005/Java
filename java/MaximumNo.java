class MaximumNo
{
public static void main(String[] args)
{
int a[]={7,3,2,4,5};
int max=a[0];
int min=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("MAX NO IS "+max);
for(int i=1;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("MAX NO IS "+min);
}
}