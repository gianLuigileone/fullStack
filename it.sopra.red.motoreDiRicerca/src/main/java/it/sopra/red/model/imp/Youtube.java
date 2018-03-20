package it.sopra.red.model.imp;

import java.awt.Desktop;
import java.net.URI;
import java.util.GregorianCalendar;

import it.sopra.red.model.Streaming;

public class Youtube  extends Page implements Streaming{

	public Youtube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Youtube(String id, String tag, GregorianCalendar data) {
		super(id, tag, data);
		// TODO Auto-generated constructor stub
	}

	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openPage() {
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI("http://www.youtube.com");
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
