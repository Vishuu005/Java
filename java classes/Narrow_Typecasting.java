public class Narrow_Typecasting
{  
    public static void main(String[] args)
    {  
    float f=10.5f;  
    //int a=f;//Compile time error  
    int a=(int)f;  
    System.out.println(f);  
    System.out.println(a);  
    }
} 