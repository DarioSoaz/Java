import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Analisis {

	public static void main(String[] args) {
		String intro;
		
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce el texto que deseas analizar : ");
		intro=datos.nextLine();
		
		String[] frases = intro.split("\\.");
	        /*for (int i = 0; i < frases.length; i++) {
	            System.out.println(frases[i]);
	           }*/
		
		String[] palabras= intro.split(" "); 
		   /* for (int i = 0; i < palabras.length; i++) {
	            System.out.println(palabras[i]);
	           }*/
		
		//Convierto todas las palabras en minusculas y les quito los puntos para poder contarlas
		for (int i = 0; i < palabras.length; i++) {
			palabras[i]=palabras[i].toLowerCase();
			palabras[i]=palabras[i].replace(".","");
		}
		
	        System.out.println(" \n Las frases itroducidas ordenadas de menor a mayor son:");
	        burbuja( frases);
	        
	        // Guardo las palabras repetidas del array palabras en Arraylist listaPalabrasRep
	        List <String> listaPalabrasRep= new ArrayList<String>();
	        listaPalabrasRep=Arrays.asList(palabras);
	        
	        
	        HashSet<String> quipu = new HashSet<String>(listaPalabrasRep);
	       // System.out.println("Los elementos guardados son: "+ quipu);
	        System.out.println("\n Las Palabras por orden de frecuencia son:");
	     
	        
	        //Cuento las palabras repetidas y las guardo en listaPalabras
	        List <String> listaPalabras= new ArrayList<String>();
	        for (String key: quipu) {
	        String aux=(key + " , " + Collections.frequency(listaPalabrasRep, key));
	       	//System.out.println(aux);
	       	   		listaPalabras.add(aux);
	       	}
	       	
	       	
	       
	        
	        //ordenacion de la lista alfabeticamente
	         Collections.sort(listaPalabras); 
	        for (String nombre : listaPalabras) {
	             System.out.println(nombre);
	         }  
	        
	        
	   

	}
	
	private static void permuta(String[] frases, int i, int j) {
	    String t;
	   
	    t = frases[i];
	    frases[i]=frases[j];
	    frases[j]=t;
	}
	
	
	private static void burbuja(String[] frases) {
		  int n = frases.length;
		   	for (int i = 0; i <= n - 2; i++) {
		        for (int j = n - 1; j > i; j--) {
		            if (frases[j - 1].length() > frases[j].length()) {
		                permuta(frases, j - 1, j);}}}
		   	for(String element : frases) {
				System.out.println(element);
			   	  }
	}
	
	
}
