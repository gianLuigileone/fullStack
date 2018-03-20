package test;

import java.util.ArrayList;

import enums.Siti;
import gruppo.Gruppo;
import pages.Pages;
import utente.Utente;

public class Gestione 
{
	private ArrayList<Utente>listUtente=new ArrayList<Utente>();
	private ArrayList<Gruppo>listGruppo=new ArrayList<Gruppo>();
	public void addUtente(Utente utente)
	{
		for(Gruppo g: listGruppo)
		{
			
			if(!g.getIdGruppo().equals(utente.getIdGruppo()))
			{
				listUtente.add(utente);
			}
			else
			{
				System.out.println("impossibile inserire utente , gruppo non valido");
			}
		}
		
	}
	public void addGruppo(Gruppo gruppo)
	{
		for(Gruppo g: listGruppo)
		{
			for(Siti s: Siti.values())
			{
			if(!g.getIdGruppo().equals(gruppo.getIdGruppo())&&
				  (g.getSito().equals(s)))
				{
					listGruppo.add(gruppo);
				}
				else
				{
					
					System.out.println("gruppo gia esistente /sito non presente");
				}
			}
			
		}
		
	}
	public ArrayList<Utente> getAllUtenti()
	{
		return listUtente;
	}
	public ArrayList<Gruppo> getAllGruppi()
	{
		return listGruppo;
	}
	public boolean isfunc(Utente utente,Pages pagine)
	{
		
			if(utente.getIdGruppo().equals(pagine.getId()))
			{
				System.out.println("l'utente puo accedere alla pagina");
				return true;
			}
			else 
			{
				return false;
			}
	}
	public boolean access(Utente utente,Pages pagine)
	{
		if(utente.getIdUtente().equals(pagine.getId()))
		{
			
			System.out.println("l'utente puo accedere alla funzione");
			return true;
		}
		return false;
		
	}
	
	
}
