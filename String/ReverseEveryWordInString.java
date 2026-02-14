import java.io.*;
import java.util.*;
class ReverseEveryWordInString
{

    public static String Solution(String s)
    {
        StringBuffer sb=new StringBuffer();
        String [] str=s.split(" ");
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i]!=" ") sb.append(str[i]+" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) 
    {
        String str1="welcome to the jungle";
        String str2= " amazing coding skills ";
        String s1=Solution(str1);
        String s2=Solution(str2);
        System.out.println(str1);
        System.out.println(s1);
        System.out.println(str2);
        System.out.println(s2);
    
    }
}