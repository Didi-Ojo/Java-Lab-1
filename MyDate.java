package Assignment6;

import java.util.StringTokenizer;

public class MyDate
{
	//instance variables
	private int day;			
	private int month;
	private int year;
		
	//constructor
	public MyDate(String aDate)
	{
		StringTokenizer myToken;						//tokenizes date given
		myToken = new StringTokenizer(aDate, "/");		
		day = Integer.parseInt(myToken.nextToken());		//first token is the day
		month = Integer.parseInt(myToken.nextToken());		//second token is the month
		year = Integer.parseInt(myToken.nextToken());		//third token is the year
	}
		
	//copy constructor
	public MyDate(MyDate aDate)
	{	//copies date
		day = aDate.day;		
		month = aDate.month;
		year = aDate.year;
	}
	
	public String toString()
	{	//prints values in the object as a string
		String nameOfMonth = "";		//name of month is first an empty string
		String date = "";				//date is first empty
		String yr;
		//name of month is the coreesponding number of the month
		if (month == 1)   nameOfMonth = "January";
		if (month == 2)   nameOfMonth = "February";
		if (month == 3)   nameOfMonth = "March";
		if (month == 4)   nameOfMonth = "April";
		if (month == 5)   nameOfMonth = "May";
		if (month == 6)   nameOfMonth = "June";
		if (month == 7)   nameOfMonth = "July";
		if (month == 8)   nameOfMonth = "August";
		if (month == 9)   nameOfMonth = "September";
		if (month == 10)  nameOfMonth = "October";
		if (month == 11)  nameOfMonth = "November";
		if (month == 12)  nameOfMonth = "December";
			
		if (day == 1 || day == 21 || day == 31) date = +day +"st";	//1st 21st 31st
		else if (day == 2 || day == 22) date = +day +"nd";			//2nd 22nd
		else if (day == 3 || day == 23) date = +day +"rd";			//4th 5th 6th..,
		else date = +day +"th";
			
		yr = "" +year;
		yr = yr.substring(2);	//gets last 2 value of the year
			
		return nameOfMonth +" " +date +", '" +yr;		//returns a string
	}

	public boolean lessThan(MyDate otherDate)
	{	//checks if a date is earlier than another date
		if (this.year < otherDate.year) return true;		//if first year is earlier returns true
		if (this.year > otherDate.year) return false;		//if the other date is earlier returns false
		if (this.year == otherDate.year)	//if years are equal checks months
		{
			if (this.month < otherDate.month) return true;		//if the month is earlier returns true
			if (this.month > otherDate.month) return false;		//if other month is earlier returns false
			if (this.month == otherDate.month)					//if both year and month are equal checks date
			{
				if (this.day < otherDate.day) return true;		//if date is earlier returns true
			}
		}
		return false;	//if they are equal dates/month/year or other date is earlier returns false
	}
	
	public boolean equals(MyDate OtherDate)
	{
		//returns true is year month and day are equal false otherwise
		if ((this.year == OtherDate.year) && (this.month == OtherDate.month) && (this.day == OtherDate.day))
		{
			return true;
		}
		else return false;
	}
}



