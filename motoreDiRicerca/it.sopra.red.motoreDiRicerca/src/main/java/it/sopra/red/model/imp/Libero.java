package it.sopra.red.model.imp;

import java.awt.Desktop;
import java.net.URI;
import java.util.GregorianCalendar;

import it.sopra.red.model.Mail;

public class Libero extends Page implements Mail {

	public Libero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libero(String id, String tag, GregorianCalendar data) {
		super(id, tag, data);
		// TODO Auto-generated constructor stub
	}

	public void sendTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openPage() {
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI("http://liberomail.libero.it/");
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
