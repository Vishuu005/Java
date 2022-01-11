class Familydetail
{
   

         String  name, fname,phn;
         int age,id;
     
        public Familydetail(String  name, int age, int id,String fname,String phn)
       {

         this.name=name;
         this.age=age;
        this.id=id;
        this.fname=fname;
        this.phn=phn;
       }
     
      void fun()
      {
      System.out.println(" my name is : "+name);
      }
      public static void main(String [] args)
        {
        Familydetail obj = new Familydetail("sahil",24,12345,"dilip","56783456");
        obj.fun();
       }
  
}