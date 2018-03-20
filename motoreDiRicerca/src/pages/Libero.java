package pages;
import java.util.GregorianCalendar;

public class Libero extends Pages
{

	public Libero(String id, String tag, GregorianCalendar data, boolean isClose) {
		super(id, tag, data, isClose);
		
	}
	public void sendTo(String link)
	{
		System.out.println("mail to...."+link);
	}
}
