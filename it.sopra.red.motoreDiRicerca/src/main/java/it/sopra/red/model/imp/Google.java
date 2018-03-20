package it.sopra.red.model.imp;

import java.awt.Desktop;
import java.net.URI;
import java.util.GregorianCalendar;

import it.sopra.red.model.Search;

public class Google  extends Page implements Search
{

	public void search() {
		// TODO Auto-generated method stub
		
	}

	public Google() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Google(String id, String tag, GregorianCalendar data) {
		super(id, tag, data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage() {
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI("http://www.google.com");
			  desktop.browse(oURL);
			} catch (Exception e) {
			  e.printStackTrace();
			}
		
	}

	@Override
	public void closePage() {
		// TODO Auto-generated method stub
		
	}

}
