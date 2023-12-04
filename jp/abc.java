import java.util.*;

class abc
{

  public static void main(String args[])
   {
   Scanner in=new Scanner(System.in);
   int a,b,c=0;
   System.out.println("please enter the two numbers");
try{  
     a=in.nextInt();
      b=in.nextInt();
      c=a/b;
   }
catch(Exception e)
  {
  System.out.println("we cannot divide the number with zero"+e);

    }
  System.out.println("the result is="+c);






}