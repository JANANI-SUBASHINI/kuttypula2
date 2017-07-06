# kuttypula2
import java.io.*;
import java.util.*;
    public class Main
{
  public static void main(String arg[])throws IOException 
  {
    Scanner sc=new Scanner(System.in);
    int result=1;
    int n=sc.nextInt(); 
    int p=sc.nextInt();
    if(n>=0&&p==0)
    {
      result=1;
    }
    else if(n==0&&p>=1)
    { 
      result=0;
    }
    else
    {
      for(int i=1;i<=p;i++)
      {
        result=result*n;
      }      
    }
    System.out.println(n+"^"+p+"="+result);
    
  }
}
