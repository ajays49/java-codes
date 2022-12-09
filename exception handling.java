import java.util.*;
public class Main
{
  public static void main(String args[]) 
  {
    try
    {
        int age;
        Scanner input=new Scanner(System.in);
        age=input.nextInt();
        if (age < 18)
        {
        throw new ArithmeticException();
        }
        else
        {
        System.out.println("Access granted - You are old enough!");
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println("Access denied!");
    }
  }
}
