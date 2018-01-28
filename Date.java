package newproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class Date {
	private int month;
	private int day;
	private int year;
	private String[] monthName={"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December" };
	private int[] monthEnds={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int	getDay() 
	{ return day; }
	public int getYear()  { return year;}
	public int getMonth()
	{
		return month;
	}
	public void setDay(int d)
	{
		day=d;
	}
	
	public void setMonth(int m)
	{
		
	if (m==0||m==1||m==2||m==3||m==4||m==5||m==6||m==7||m==8||m==9||m==10||m==11)
    {
    month = m;
    }
	else
	{
		throw new RuntimeException();
		
	}

	
}

	public void setYear(int y)
	{
	if(y>0)
	{
		year=y;
		
	}
	else
	{
		y=-y;
		year=y;
		throw new RuntimeException();
	}
	
	}
	public String getMonthName(int m) {
		if(m<1||m>12) return "";
		else return monthName[m];}
	 
	
	
	public void showDate1()  {
		getDay();
		System.out.print(".");
		System.out.print(getMonth());
		System.out.print(".");
		System.out.print(getYear());
	}
	public void showDate2() {
		System.out.print(getMonthName(getMonth()));
		System.out.print(" ");
		System.out.print(getDay());
		System.out.print(",");
		System.out.print(getYear());
	}
	public void showDate3() {
		System.out.print(getDay());
		System.out.print(" ");
		System.out.print(getMonthName(getMonth()));
		System.out.print(" ");
		System.out.print(getYear());
	}

	
}
