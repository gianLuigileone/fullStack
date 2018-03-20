package it.sopra.red.model.imp;

import java.util.GregorianCalendar;

public  abstract class Page 
{
	private String id;
	private String tag;
	GregorianCalendar data;
	public abstract void openPage();
	public abstract void closePage();
	
	public Page(String id, String tag, GregorianCalendar data) {
		super();
		this.id = id;
		this.tag = tag;
		this.data = data;
	}
	public Page()
	{

		this.id=null;
		this.tag=null;
		this.data=null;
	}
	@Override
	public String toString() {
		return "Page [id=" + id + ", tag=" + tag + ", data=" + data.getTime() + "]\n";
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
}
