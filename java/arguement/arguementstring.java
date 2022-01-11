class Familydetail
{
	  private String name; 
	 private int age;
	public Familydetail(String name,int age)
	{
		this.name=name;
		this.age=age;
		//this.id=id;
		////this.fname=fname;
		//this.phn=phn;
		System.out.println("my name is:"+name);
		System.out.println("my name is:"+age);
		//System.out.println("my name is:"+i);
		//System.out.println("my name is:"+f);
		//System.out.println("my name is:"+p );
		
	}


	public static void main(String[] args)
	{
		
		Familydetail obj=new Familydetail("Avnish",18);

	}
}