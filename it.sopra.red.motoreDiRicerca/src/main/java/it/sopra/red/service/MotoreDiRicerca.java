package it.sopra.red.service;
import enums.Azioni;
import it.sopra.red.model.imp.*;
public interface MotoreDiRicerca 
{
	boolean verificaFunzione(String idUtente,String idPagina,Azioni a);
	Iterable<Page>ordinaListaPagine(String idGruppo);
	Page getPage(String idUtente,String idPagina);
}
