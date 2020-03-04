import java.util.*;

public class DayOfWeek 
{
	public static void main(String agr[]) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter Year");
	  int year=s.nextInt();
	  System.out.println("Enter month");
	  int month=s.nextInt();
	  System.out.println("Enter Day");
	  int day=s.nextInt();
	  
	  System.out.println("Day of week is");
	  int y0 = year - (14 - month) / 12;
	  int x = y0 + y0/4- y0/100 + y0/400;
	  int m0 = month + 12 * ((14 -month) / 12)- 2;
	  int d0 = (day+ x + 31*m0 / 12) % 7;
	  System.out.println(d0);
	  switch(d0)
		 {
		 case 0:
			 System.out.println("Sunday");
			 break;
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			 System.out.println("Wednesday");
			 break;
		 case 4:
			 System.out.println("Thursday");
			 break;
		 case 5:
			 System.out.println("Friday");
			 break;
		 case 6:
			 System.out.println("Saturday");
			 break;
		 }
      
	  s.close();
	}
}
