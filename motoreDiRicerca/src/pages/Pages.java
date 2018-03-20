package pages;
import java.util.GregorianCalendar;

public class Pages 
{
	private String id;
	private String tag;
	private GregorianCalendar data;
	private boolean isClose=false;
	
	public Pages(String id, String tag, GregorianCalendar data,boolean isClose) {
		this.id=id;
		this.tag = tag;
		this.data = data;
		this.isClose = false;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public GregorianCalendar getData() {
		return data;
	}
	public void setData(GregorianCalendar data) {
		this.data = data;
	}
	public boolean isClose() {
		return isClose;
	}
	public void setClose(boolean isClose) {
		this.isClose = isClose;
	}
	
	
}
