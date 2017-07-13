import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
  {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		StringBuffer bf=new StringBuffer();
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			bf.append(a[i]);
		}
		String s11,s22;
		s11=bf.toString();
		System.out.println(s11);
		int num=s.nextInt();
		int b[]=new int[num];
		StringBuffer bf1=new StringBuffer();
		for(int i=0;i<num;i++){
			b[i]=s.nextInt();
			bf1.append(b[i]);
		}
		s22=bf1.toString();
		int count=0;
		
			if(s11.contains(s22)){
				count=1;
			}
		if(count==1){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
