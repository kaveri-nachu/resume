package encapsulation;
import java.util.*;
public class reverse {
	public static void main(String [] args)
	{
	String n;
	System.out.println("enter the sentence");
	Scanner in=new Scanner(System.in);
	n=in.nextLine();
	String str[]=n.split(" ");
	String f="";
	for(int i=str.length-1;i>=0;i--)
	{
	f +=str[i]+" ";
	}
	System.out.println("reverse word output");
	System.out.println(f);
	}
	}
