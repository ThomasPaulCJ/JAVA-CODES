import java.util.*;

public class Freqstring
{
	public static void main(String args[]})
	{
		Scanner sc=new Scanner(System.in);
		String str;
 		System.out.println("Enter a string");
		str=sc.next();
		Freqstring obj=new Freqstring();
		obj.freq(str);
	}
	void freq(String str)
	{
		int len=str.length();
		for (int i = 0; i < len; i++)  
			count[str.charAt(i)]++;
  
		char ch[] = new char[str.length()];  

		for (int i = 0; i < len; i++)   
		{  
			ch[i] = str.charAt(i);  
			int find = 0;  
			for (int j = 0; j <= i; j++)   
			{   
  				if (str.charAt(i)==ch[j])            //if any matches found
					find++;  
			}             
			if (find == 1)                   //prints occurrence of the character   
				System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
		}
	}
}