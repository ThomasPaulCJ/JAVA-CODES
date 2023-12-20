import java.util.Scanner;
import java.util.StringTokenizer;
public class Stokenizer {
public static void main(String args[])
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter name of file to be created");
    String name=scan.nextLine()+"txt";
    FileWriter fw =new FileWriter(name);
    System.out.println("Enter the intergers:");
    String str=scan.nextLine();
    scan.close();
    StringTokenizer s=new StringTokenizer(str," ");
    int sum=0;
    while(s.hasMoreTokens())
    {
    int n=0;
    n=Integer.parseInt(s.nextToken());
    System.out.println("Ingegers are:"+n);
    fw.write(n);
    sum=sum+n;
    }
    System.out.println("SUM OF INTEGERS ARE:"+sum);
   }
}