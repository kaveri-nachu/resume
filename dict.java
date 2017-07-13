import java.util.ArrayList;
import java.util.*;

public class dict
{
public static void main(String[] args) {
		ArrayList<String> arl=new ArrayList<String>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of words for dictionary:");
		int n=in.nextInt();
		System.out.println("Enter the words for dictionary");
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=in.nextLine();
		}
		in.nextLine();
		Arrays.sort(s);
		System.out.println("Enter the sentence:");
		String sen=in.nextLine();
		for(String s11:sen.split(" ")){
			int flag=0;
			for(String s22:s){
				if(s11.equalsIgnoreCase(s22)){
					flag=1;
				}
			}
			if(flag==0)
				arl.add(s11);
			}
		for(String dict:s){
			for(String sente:arl){
				int len=0;
				char c[]=sente.toCharArray();
				for(int k=0;k<c.length;k++){
					if(dict.contains(String.valueOf(c[k]))){
					len++;
					}
					if(len==c.length){
						System.out.println("THE SUGGESTED WORD FOR \""+sente+"\" IS \""+dict+"\"");
					}
			}
		}

	}

}
}
