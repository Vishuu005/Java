class final
    {
        final public int i;
     
        Test(int val)    {  this.i = val;  }
     
        Test()
        {
            // Calling Test(int val)
            this(10);
        }
     
        public static void main(String[] args)
        {
            final t1 = new final();
            System.out.println(t1.i);
     
            final t2 = new final(20);
            System.out.println(t2.i);
        }
    



    
}
