import java.util.*;
class Palindrome
{
  public static void main(String args[])    ///throws IOException
  {
    Scanner sc = new Scanner(System.in);
    String str;
    int count=0;
    System.out.println("Enter the string : ");
    str=sc.nextLine();
    String rev="";
    String w[]=str.split(" ");
    for (int i=0;i<w.length;i++)
    {
      count++;
      if(isPalindrome(w[i]))
      {
        //count++;
        rev +=  w[i] + " ";
  System.out.println("String which are palindrome : "+rev); 
      }

    }
    //System.out.println("Reversed String : "+rev);
    System.out.println("Number of words : "+count);
  }
              public static boolean isPalindrome(String str)
              {
                char ch;
                int len,half;
                len=str.length();
                half=len/2;
                for(int i=0;i<half;i++)
                {
                  if(str.charAt(i)!=str.charAt(len-i-1))
                  return false;
                }
                return true;
              }
}
