//check if string is palindrome recursively
public class Exercise {
    public  boolean isPalindrome(String s)
    
    {   
        // TODO
        String o=s;
        s=revStr(s);
        
        return (o.equals(s));
    }
    public String revStr(String s)
    {
        if(s==null || s.length()<=1)
        return s;
        return revStr(s.substring(1))+s.charAt(0);
    }

}
