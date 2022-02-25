//reverse string recursively
public class Exercise {
    public String reverse(String str)
    {
        // TODO
        if(str==null || str.length()<=1)
        return str;
        return reverse(str.substring(1))+str.charAt(0);
    }

}
