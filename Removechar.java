import java.util.*;

public class Removechar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
 	System.out.println("Enter a character to be removed from the string");
        String c = sc.next();
        sc.close();
	String newstr;
	for(int i=0;i<str.length();i++)
	{
		if(c.equalsIgnoreCase(str.charAt(i)))
        		newstr = c.replace(str.charAt(i),'.');
	}
        System.out.println(newStr);
    }
}
