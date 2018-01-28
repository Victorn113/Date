package newproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class newproject {
	


	public void main(String[] argv) throws NumberFormatException, IOException 
	{
		String[] monthName={"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December" };
		int[] monthEnds={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
		
		int Y;
		int M = 0;
		int D = 0;
		int month;
		boolean continue1=false;
		Date today=new Date();
		
	BufferedReader cin;
	cin = new BufferedReader(new InputStreamReader(System.in));
	
	do {
		System.out.println("Enter a year");
		Y=Integer.parseInt(cin.readLine());
		boolean negative=false;
		boolean overflow1=false;
		
		try
		{
			System.out.println("Enter month");
			month=Integer.parseInt(cin.readLine());
			M=month-1;
			overflow1=true;
			
			today.setMonth(M);	
		}
		catch(RuntimeException BadAlloc)
		{
			System.out.println("Insufficient memory");
			overflow1=true;
		}
		try
		{
			System.out.println("Enter a day");
			D=Integer.parseInt(cin.readLine());
			if((D<=monthEnds[M])&&(D>0))
			{
				today.setDay(D);
				
				continue1=true;
			}
			else
			{
				System.out.println("Invalid input");
				continue1=true;
			}
		}
		catch(RuntimeException BadAlloc2)
		{
			System.out.print("Insufficient memory");
			overflow1=true;
		}
		
if ((D<=monthEnds[M])&&(D>0))
		{
		today.showDate1();
		if(negative)
		{
			System.out.println("BC");
		}
		today.showDate2();
		if(negative)
		{
			System.out.println("BC");
		}
		today.showDate3();
		if(negative)
		{
			System.out.println("BC");
		}
		}
		
		
	}while(continue1);
	
	
	
	}

	

	
	
}
