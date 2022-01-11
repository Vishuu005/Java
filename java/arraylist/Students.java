 public class Students
{
private String Sname,username,password,email;
private long Mobile;
public String getSname()
{
return Sname;
}
public void setSname(String sname)
{
Sname=sname;
System.out.println(Sname);
}
public String getUsername()
{
return username;
}
public void setUsername(String username)
{
this.username=username;
System.out.println(username);
}
public String getPassword()
{
return password;
}
public void setPassword(String password)
{
this.password=password;
System.out.println(password);
}
public String getEmail()
{
return email;
}
public void setEmail(String email)
{
this.email=email;
System.out.println(email);
}
public long getMobile()
{
return Mobile;
}
public void setMobile(long mobile)
{
Mobile=mobile;
System.out.println(Mobile);
}

public static void main(String[] args)
{
Students obj=new Students();
obj.setSname("Avnish");
obj.setUsername("Avnish yadav");
obj.setPassword("Avnish@1234!");
obj.setEmail("awnishy485@gmail.com");
obj.setMobile(7267967570l);
}
}