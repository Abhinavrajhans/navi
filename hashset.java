
import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	
		String s=obj.next(); 
		
		
		int len=s.length();
		
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<len;i++)
		{
			set.add(s.charAt(i));
		}
		
		int size=set.size();
		
		if(size%2==0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else System.out.println("IGNORE HIM!");
		
	}
}
