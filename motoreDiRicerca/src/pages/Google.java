package pages;
import java.util.GregorianCalendar;

public class Google extends Pages{

	public Google(String id, String tag, GregorianCalendar data, boolean isClose) 
	{
		super(id, tag, data, isClose);
		
	}
	public void search(String link)
	{
		System.out.println("loading...."+link);
	}

}
