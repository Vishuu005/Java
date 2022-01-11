import java.util.Scanner;
class Grade
{
float pre,hindi,eng,math,physics,chem,totalno,fullno;
float a;
void fun()
{
Scanner ob=new Scanner(System.in);
	System.out.println("enter the hindi marks");
	hindi=ob.nextFloat();
		System.out.println("enter the eng marks");
		eng=ob.nextFloat();
			System.out.println("enter the maths marks");
			math=ob.nextFloat();
				System.out.println("enter the physics marks");
				physics=ob.nextFloat();
					System.out.println("enter the chemistry marks");
					chem=ob.nextFloat();
						System.out.println("Print the total marks");
						totalno=hindi+eng+math+physics+chem;
						System.out.println(totalno);
							System.out.println("enter the full marks");
							fullno=ob.nextInt();
							System.out.println("print the presentage");
							a=totalno*100/fullno;
							System.out.println(a+"%");
System.out.println("print the grade");


if(a<33)
{
System.out.println("fail");
}
else if(a>33&&a<=50)
{
System.out.println("Grade C");
}
else if(a>50&&a<=80)
{
System.out.println("Grade B");
}
else if(a>80&&a<=100)
{
System.out.println("Grade A");
}
else
{
System.out.println("invalide");
} 
}
public static void main(String[] ardfd)
{
Grade obj=new Grade();
obj.fun();
}
}