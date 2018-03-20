
package it.sopra.red.service.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashSet;

import enums.Azioni;
import it.sopra.red.service.MotoreDiRicerca;
import it.sopra.red.model.Mail;
import it.sopra.red.model.Search;
import it.sopra.red.model.Streaming;
import it.sopra.red.model.imp.*;
public class MotoreDiRicercaImpl implements MotoreDiRicerca
{
	 ArrayList<Utente>listaUtenti=new ArrayList<Utente>();
	 ArrayList<Gruppo>listaGruppi=new ArrayList<Gruppo>();
	
	public boolean verificaFunzione(String idGruppo, String idPagina, Azioni a)
	{	Page p= getPage(idGruppo,idPagina);
	System.out.println("pagina:"+p);
		if(p!=null)
			{
				if( p instanceof Mail&&(a.name().equals("mail")))
				{
					System.out.println("funzione consentita mail");
					return true;
				}
				if( p instanceof Search&&(a.name().equals("search")))
				{
					System.out.println("funzione consentita");
					return true;
				}
				if( p instanceof Streaming&&(a.name().equals("stream")))
				{
					System.out.println("funzione consentita");
					return true;
				}					
				System.out.println("funzione non consentita");

				
			}
			
		return false;
	}

	public Iterable<Page> ordinaListaPagine(String idGruppo) 
	{	ArrayList <Page>lP = new ArrayList<Page>();
		
		for(Gruppo g:listaGruppi)
		{
			
			if(g.getIdGruppo().equals(idGruppo))
			{
				for(Page p: g.getListaPagine())
				{
					lP.add(p);
				}
				Collections.sort(lP,new Comparator<Page>()
				{
					public int compare(Page arg0, Page arg1)
					{
						return arg0.getData().compareTo(arg1.getData());
					}
					
				});
			}
		}
		return lP;
	}

	public Page getPage(String idGruppo,String idPagina) 
	{
		for (Gruppo gruppo : listaGruppi)
		{
			System.out.println(listaGruppi.size());
			if(gruppo.getIdGruppo().equals(idGruppo))
			{
				for (Page pagina : gruppo.getListaPagine())
				{
					if(pagina.getId().equals(idPagina))
					{
						return pagina;
					}
				}
			}
		}
		return null;
	}
	public static void main(String[]args)
	{
		//inserimento degli utenti

		 ArrayList<Utente>listaUtenti=new ArrayList<Utente>();
		 ArrayList<Gruppo>listaGruppi=new ArrayList<Gruppo>();
		
		listaUtenti.add(new Utente("1","1"));
		listaUtenti.add(new Utente("2","1"));
		listaUtenti.add(new Utente("3","1"));
		listaUtenti.add(new Utente("1","2"));
		listaUtenti.add(new Utente("2","2"));
		//inserimento gruppi
		Gruppo g=new Gruppo("1");
		Gruppo g2=new Gruppo("2");
		//inserimento pagine
		GregorianCalendar data =new GregorianCalendar();
		data.setLenient(false);
		data.set(GregorianCalendar.YEAR, 2010);
		data.set(GregorianCalendar.MONTH, 3);
		data.set(GregorianCalendar.DATE, 2);
		data.getTime();
		GregorianCalendar data1 =new GregorianCalendar();
		data1.setLenient(false);
		data1.set(GregorianCalendar.YEAR, 2001);
		data1.set(GregorianCalendar.MONTH, 3);
		data1.set(GregorianCalendar.DATE, 2);
		data1.getTime();
		GregorianCalendar data2 =new GregorianCalendar();
		data2.setLenient(false);
		data2.set(GregorianCalendar.YEAR, 2005);
		data2.set(GregorianCalendar.MONTH, 3);
		data2.set(GregorianCalendar.DATE, 2);
		data2.getTime();
		GregorianCalendar data3 =new GregorianCalendar();
		data3.setLenient(false);
		data3.set(GregorianCalendar.YEAR, 2005);
		data3.set(GregorianCalendar.MONTH, 3);
		data3.set(GregorianCalendar.DATE, 2);
		data3.getTime();
		Page p1=new Youtube("1","Youtube",data);
		Page p2=new Libero("4","Libero",data1);
		Page p3=new Google("7","Google",data2);
		Page p4=new Youtube("3","Youtube",data3);
		//inserimento pagine dentro gruppo
		g.addPagina(p1);
		g.addPagina(p2);
		g.addPagina(p3);
		g.addPagina(p4);
		listaGruppi.add(g);
		MotoreDiRicerca m=new MotoreDiRicercaImpl();
		System.out.println(m.getPage("1", "1"));
		System.out.println(m.verificaFunzione("1","4", Azioni.search));
		System.out.println(m.verificaFunzione("1","7", Azioni.search));
		System.out.println(m.verificaFunzione("1","1", Azioni.search));
		
		System.out.println(m.ordinaListaPagine("1"));
		Page h= new Youtube();
		h.openPage();
	}

}
