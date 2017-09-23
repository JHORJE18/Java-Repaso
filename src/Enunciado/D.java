package Enunciado;

import java.util.Scanner;
import Principal.Diseño;

public class D {
	
	//Variable diseño
	Diseño ds = new Diseño(56, "-");
	int limit = 10;
	int[] vector = new int[limit];
	
	public void inicio(){
		Scanner entrada = new Scanner(System.in);
		ds.enunciado("Definir un vector de 10 enteros, lo rellenamos y después nos muestra por pantalla los valores de dicho vector");
		
		//Preguntamos datos
		for (int i=0; i<vector.length; i++){
			ds.limpiarln();
			System.out.println("Introduce el Vector nº " + (i+1));
			vector[i] = entrada.nextInt();
		}
		ds.limpiarln();
		
		//Imprimimos inicio de la serie
		System.out.print("Vectores = {");
		for (int i=0; i<vector.length; i++){
			System.out.print(vector[i]);
			
			//Ultimo digito (Sin coma y finaliza serie)
			if (i == (vector.length -1)){
				System.out.println("}");
			} else {
				//Inserta coma y espacio para seguir serie
				System.out.print(", ");
			}
		}

	}

}
