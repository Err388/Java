import java.util.*;
public class Enc
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the encryption key(String):");//ex:abcdefg
        String inp=in.nextLine();
        char[] ekey=inp.toCharArray();
        int keylen=ekey.length;
        System.out.print("Enter the string to be encrypted:");
        String pt=in.nextLine();//ex:as soon as jacob left->bs soon bs jbdoc lfgt
        int len=pt.length();
        String inpenc=new String();
        int flag=0;
        for(int i=0;i<len;i++)
        {
            int j=0;flag=0;
            while((j<keylen)&&(flag==0))
            {

                if(pt.charAt(i)==ekey[j])
                {
                    if(j<(keylen-1))
                    {
                        inpenc+=ekey[j+1];

                    }
                    else
                    {
                        inpenc+=ekey[0];
                    }
                    flag=1;
                }
                else
                {
                    if(j==(keylen-1))
                    {
                        inpenc += pt.charAt(i);
                        flag = 1;
                    }
                }
                j++;

            }
        }
        System.out.println("The encrypted string of pt: "+pt+" with key= "+inp+" is : "+inpenc);
    }
}