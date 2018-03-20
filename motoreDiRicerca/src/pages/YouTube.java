package pages;
import java.util.GregorianCalendar;

public class YouTube extends Pages
{

	public YouTube(String id, String tag, GregorianCalendar data, boolean isClose) {
		super(id, tag, data, isClose);
		
	}
	public void stream(String link)
	{
		System.out.println("loading...."+link);
	}
}
