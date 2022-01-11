class Age
{
   private int days;
   private int months;
   private int years;
 
   private Age()
   {
      //Prevent default constructor
   }
 
   public Age(int days, int months, int years)
   {
      this.days = days;
      this.months = months;
      this.years = years;
 System.out.println(days+" "+months+" "+years);
   }
 
   public int getDays()
   {
      return this.days;
   }
 
   public int getMonths()
   {
      return this.months;
   }
 
   public int getYears()
   {
      return this.years;
   }

   @Override
   public String toString()
   {
      return years + " Years, " + months + " Months, " + days + " Days";
   }
public static void main(String[] args)
{
Age ob=new Age();
Age obj=new Age(19,12,1996);
}
}