  package codificacio;

import java.util.Scanner;

public class Codificacio {
    
    public static void main(String[] args) {
       
    	//CODIFICACION DE PALABRAS
    	
        Scanner datos = new Scanner(System.in);
        
        String palabra;
        System.out.print("Introduce la palabra que quieres codificar: ");
        palabra = datos.next();
        
        int num = 0;
        for(int i = 0; i < palabra.length(); i++)
        {
            switch (palabra.toUpperCase().charAt(i))
            { 
                case 'A': case 'B': case 'C': num = 2; break;
                case 'D': case 'E': case 'F': num = 3; break;    
                case 'G': case 'H': case 'I': num = 4; break;
                case 'J': case 'K': case 'L': num = 5; break;
                case 'M': case 'N': case 'O': num = 6; break;
                case 'P': case 'Q': case 'R': case 'S': num = 7; break;
                case 'T': case 'U': case 'V': num = 8; break;
                case 'W': case 'X': case 'Y': case 'Z': num = 9; break;
            }
            System.out.print(num);
        }
        
        //CODIFICACION DE NUMEROS
        
        String numeros;
        System.out.print("\n Introduce los numeros que quieres codificar, MAX 3 NUMEROS: ");
        numeros = datos.next();
        
                	
         int numer = Integer.parseInt(numeros);
         //System.out.print(numer);
         char[]Nume=numeros.toCharArray();
         //System.out.println(nume[0]);
        //System.out.println(nume[1]);
        //System.out.println(nume[2]);
         String[] Texto = new String[3];
       
         for(int i=0;i<Nume.length;i++){
        /*	int nume=Nume[0]; // nume=Nume[i];
        	 if (nume==2) {
 	        	Texto[0] = 'A';
 	        	Texto[1] = 'B';
 	        	Texto[2] = 'C';
 	        }
 	        if (nume==3) {
 	        	Texto[0] = 'D';
 	        	Texto[1] = 'E';
 	        	Texto[2] = 'F';
 	        }
 	        if (nume==4) {
 	        	Texto[0] = 'G';
 	        	Texto[1] = 'H';
 	        	Texto[2] = 'I';
 	        }
 	        if (nume==5) {
 	        	Texto[0] = 'J';
 	        	Texto[1] = 'K';
 	        	Texto[2] = 'L';
 	        }
 	        if (nume==6) {
 	        	Texto[0] = 'M';
 	        	Texto[1] = 'N';
 	        	Texto[2] = 'O';
 	        }
 	        if (nume==7) {
 	        	Texto[0] = 'P';
 	        	Texto[1] = 'R';
 	        	Texto[2] = 'S';
 	        	
 	        }
 	        if (nume==8) {
 	        	Texto[0] = 'T';
 	        	Texto[1] = 'U';
 	        	Texto[2] = 'V';
 	        }
 	        if (nume==9) {
 	        	Texto[0] = 'W';
 	        	Texto[1] = 'X';
 	        	Texto[2] = 'Y';
 	        	
 	        }*/
        	for(int j=0;j<Nume.length;j++){
        	/*	 nume=Nume[1]; // nume=Nume[j];
        		 if (nume==2) {
     	        	Texto[0] = 'A';
     	        	Texto[1] = 'B';
     	        	Texto[2] = 'C';
     	        }
     	        if (nume==3) {
     	        	Texto[0] = 'D';
     	        	Texto[1] = 'E';
     	        	Texto[2] = 'F';
     	        }
     	        if (nume==4) {
     	        	Texto[0] = 'G';
     	        	Texto[1] = 'H';
     	        	Texto[2] = 'I';
     	        }
     	        if (nume==5) {
     	        	Texto[0] = 'J';
     	        	Texto[1] = 'K';
     	        	Texto[2] = 'L';
     	        }
     	        if (nume==6) {
     	        	Texto[0] = 'M';
     	        	Texto[1] = 'N';
     	        	Texto[2] = 'O';
     	        }
     	        if (nume==7) {
     	        	Texto[0] = 'P';
     	        	Texto[1] = 'R';
     	        	Texto[2] = 'S';
     	        	
     	        }
     	        if (nume==8) {
     	        	Texto[0] = 'T';
     	        	Texto[1] = 'U';
     	        	Texto[2] = 'V';
     	        }
     	        if (nume==9) {
     	        	Texto[0] = 'W';
     	        	Texto[1] = 'X';
     	        	Texto[2] = 'Y';
     	        	
     	        }*/
        	 for(int k=0;k<Nume.length;k++){
        		int nume=Nume[k];
        		 if (nume==2) {
     	        	Texto[0] = "A";
     	        	Texto[1] = "B";
     	        	Texto[2] = "C";
     	        }
     	        if (nume==3) {
     	        	Texto[0] = "D";
     	        	Texto[1] = "E";
     	        	Texto[2] = "F";
     	        }
     	        if (nume==4) {
     	        	Texto[0] = "G";
     	        	Texto[1] = "H";
     	        	Texto[2] = "I";
     	        }
     	        if (nume==5) {
     	        	Texto[0] = "J";
     	        	Texto[1] = "K";
     	        	Texto[2] = "L";
     	        }
     	        if (nume==6) {
     	        	Texto[0] = "M";
     	        	Texto[1] = "N";
     	        	Texto[2] = "O";
     	        }
     	        if (nume==7) {
     	        	Texto[0] = "P";
     	        	Texto[1] = "R";
     	        	Texto[2] = "S";
     	        	
     	        }
     	        if (nume==8) {
     	        	Texto[0] = "T";
     	        	Texto[1] = "U";
     	        	Texto[2] = "V";
     	        }
     	        if (nume==9) {
     	        	Texto[0] = "W";
     	        	Texto[1] = "X";
     	        	Texto[2] = "Y";
     	        	
     	        }
        	 System.out.println(Texto[0]+","+Texto[1]+","+Texto[2]);
        	 System.out.println(Texto[0]);
        	 }

       	 }

        	 }  
    
    }
        
    }
    
