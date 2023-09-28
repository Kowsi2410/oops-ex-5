
package pack1.pack2;
public class StringOperations {
     public String concatenate(String str1, String str2)
    {
        String str = str1 + str2;
        return str;
    }
    public String reverse(String str)
    {
        String str1="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            str1=ch+str1;
        }
        return str1;
    }
}


