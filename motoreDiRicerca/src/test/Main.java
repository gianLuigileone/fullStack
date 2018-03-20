package test;

import java.util.GregorianCalendar;

import enums.Azioni;
import gruppo.Gruppo;
import pages.Pages;
import pages.YouTube;
import utente.Utente;

public class Main 
{


	public static void main(String[]args)
	{
		Gestione g=new Gestione();
		Pages p1=new YouTube("1","345", new GregorianCalendar(2013,1,28,13,24,56),false);
		Gruppo group1=new Gruppo("3",p1,Azioni.Mail);
		Utente ut1=new Utente("ut1",null);
		g.addGruppo(group1);
		g.addUtente(ut1);
		System.out.println(g.access(ut1,p1));
		
		
	}
}
