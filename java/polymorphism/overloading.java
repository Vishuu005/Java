//same class,same method but defferent arguement
class overloading
{
void fxn()
{
System.out.println("without arguement method");
}
void fxn(int a)
{
System.out.println("pass arguement method"+a);
}

public static void main(String[] args)
{
overloading ob=new overloading();
ob.fxn();
ob.fxn('a');//97
}
}