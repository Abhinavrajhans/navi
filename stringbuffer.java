
import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	
		String s="abhinav";
		int len=s.length();
		StringBuffer sb=new StringBuffer();
		for(int i=len-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		
	}
}
