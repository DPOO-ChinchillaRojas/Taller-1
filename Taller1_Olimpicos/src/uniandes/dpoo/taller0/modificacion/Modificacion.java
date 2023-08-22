package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	
	private CalculadoraEstadisticas calculadora;
	public void main (String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Hola, mundo!"); 
		calculadora = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		
		
		
		System.out.println(calculadora);
	}
	
	
}
