import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringFile {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
            String newstr="";
            for(int i=0;i<input.length();i++){
                newstr=newstr+(input.charAt(i)+" ");
            }
            String fileName = "tokenizedContent.txt";
            try{
            FileWriter fileWriter = new FileWriter(fileName);

            StringTokenizer tokenizer = new StringTokenizer(input," ");
            
            while (tokenizer.hasMoreTokens()) {
                    String temp = tokenizer.nextToken();
                    fileWriter.write(temp);
            }
            fileWriter.close();
            
            }catch(IOException  e){
                System.out.println(e);
            }
          
            try{
                FileReader fileReader = new FileReader(fileName);
                int i;
                while((i=fileReader.read())!=-1)
                    System.out.print((char)i);
                fileReader.close();
            }catch(IOException  e){
                System.out.println(e);
            }
        }
}