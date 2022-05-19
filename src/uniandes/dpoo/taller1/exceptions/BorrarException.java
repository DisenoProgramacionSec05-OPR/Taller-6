package uniandes.dpoo.taller1.exceptions;

import java.util.List;


public class BorrarException extends Exception
{
	private List<String> existen;
	private List<String> noExisten;
	
	public BorrarException(List<String> existen, List<String> noExisten)
	{
		this.existen = existen;
		this.noExisten = noExisten;
	}
	
	public String darExistentes()
	{
		String autoresExistentes = asString(existen);
		return autoresExistentes;
	}
	
	public String darInexistentes()
	{
		String autoresInexistentes = asString(noExisten);
		return autoresInexistentes;
	}
	
	
	private String asString(List<String> lista)
	{
		String cadena = "";
		
		if (lista.size()>0)
		{
			cadena = lista.get(0);
		}
			
		for (int i=1; i<lista.size(); i++)
		{
			String autor = lista.get(i);
			cadena += ", " + autor;
		}
		
		return cadena;
	}
	
}
