import java.time.LocalDate;  // import the LocalDate class
import java.time.LocalDateTime;
class Main {  
  public static void main(String[] args) {  
    LocalDate myObj = LocalDate.now();  // Create a date object
	LocalDateTime obj=LocalDateTime.now();//create date and time
    System.out.println(myObj);  // Display the current date
System.out.println(obj);
  }  
}  
