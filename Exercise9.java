package Day7;
import java.util.*;
import java.io.*;
public class Exercise9 {
	public static void main(String args[]) {
		File file=new File("C:/Users/Anuj Saxena/eclipse-workspace/Example/src/Day5/Text.txt");
		long modifiedValue=file.lastModified();
		Date date=new Date(modifiedValue);
		
		System.out.println("The last modified time is = "+date);
		
	}
}
