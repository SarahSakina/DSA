//find n return first upperCase letter in string using recursion
public class Exercise {
    static char first(String s) {
    //   TODO
    if(s.charAt(0)>=65 && s.charAt(0)<=90)
    return s.charAt(0);
    else 
    return first(s.substring(1,s.length()));
    
    }

}
