import java.io.*;  
import java.net.*;  
import java.util.*;

public class PortScanner
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int open=0,start,end,closed;
	System.out.print("Enter ip address of target:");
	String target = s.nextLine();
	do{
		System.out.print("Enter starting port number(1-65535):");
		start = s.nextInt();
	}while(start<1 || start>65535);
	do{
		System.out.print("Enter ending port number("+(start+1)+"-65535):");
		end = s.nextInt();
	}while((start<1 || start>65535) && end>start);
	for(int i=start; i<=end; i++)
	{
		try{
			Socket soc=new Socket(target,i);
			System.out.println("TCP Port\t"+i+" is Open on "+target);
			open++;
		}catch(Exception e)
		{
			//todo
		}
	}
	
	System.out.println("Total ports scanned:"+(end-start));
	System.out.println("Open ports:"+open);
	}
}
