package com.ttdos.ejerciciotres;

import java.util.Scanner;  // Import the Scanner class

public class App {


	public static void main(String[] args) throws Exception {
		
		int medicion = 0; //Medicion
		int compfunc = 0; //Completitud Funcional
		int corfunc = 0; //Correccion Funcional
		int pertfunc = 0; //Pertinencia Funcional
		int adfuncional = 0; //Adecuacion Funcional
		
		int modu = 0; //Modularidad
		int reusa = 0; //Reusabilidad
		int analiza = 0; //Analizabilidad
		int capmod = 0;//Capacidad de ser modificado
		int capserprobado = 0; //Capacidad de ser probado
		int mantenibilidad = 0; //Mantenibilidad
		
		boolean eva; //Evaluacion de Calidad
		
		System.out.println("Bienvenido al programa de evaluación de calidad");
		
		System.out.println("Inserte la medición de Completitud Funcional");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		compfunc = obtenerCompFunc(medicion);
		System.out.println("La Completitud Funcional tiene valor: "+compfunc);
		
		
		System.out.println("Inserte la medición de Correccion Funcional");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		corfunc = obtenerCorFunc(medicion);
		System.out.println("La Correccion Funcional tiene valor: "+corfunc);
		
		
		System.out.println("Inserte la medición de Pertinencia Funcional");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		pertfunc = obtenerPertFunc(medicion);
		System.out.println("La Pertinencia Funcional tiene valor: "+pertfunc);
		
		
		adfuncional = obtenerAdecuacionFuncional(compfunc, corfunc, pertfunc);
		System.out.println("La Adecuación Funcional tiene valor: "+adfuncional);
		
		
		System.out.println("Inserte la medición de Modularidad");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		modu = obtenerModu(medicion);
		System.out.println("La Modularidad tiene valor: "+modu);
		
		
		System.out.println("Inserte la medición de Reusabilidad");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		reusa = obtenerReusa(medicion);
		System.out.println("La Reusabilidad tiene valor: "+reusa);
		
		
		System.out.println("Inserte la medición de Analizabilidad");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		analiza = obtenerAna(medicion);
		System.out.println("La Analizabilidad tiene valor: "+analiza);
		
		
		System.out.println("Inserte la medición de Capacidad de ser modificado");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		capmod = obtenerCapModificacion(medicion);
		System.out.println("La Capacidad de ser modificado tiene valor: "+capmod);
		
		
		System.out.println("Inserte la medición de Capacidad de ser probado");
		System.out.println("Inserte un número del 0 al 100");
		medicion = leerCosas();
		capserprobado = obtenerReusa(medicion);
		System.out.println("La Capacidad de ser probado tiene valor: "+capserprobado);
		
		mantenibilidad = obtenerMantenibilidad(modu, reusa, analiza, capmod, capserprobado);
		System.out.println("La Mantenibilidad tiene valor: "+mantenibilidad);
		
		System.out.println("RESULTADO DE EVALUACION DE CALIDAD");
		eva = evaluacionCalidad(mantenibilidad, adfuncional);
		
		if (eva) {
			System.out.println("El Sistema evaluado HA PASADO la evaluacion");
		} else {
			System.out.println("El Sistema evaluado NO HA PASADO la evaluacion");
		}
		
	}
	
	public static int obtenerCompFunc (int medicionuno) {
		
		
		int res = -1;
		
		if (medicionuno < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (medicionuno >= 0 && medicionuno < 10) {
			res =  0;
		} else if (medicionuno >= 10 && medicionuno < 35) {
			res =  1;
		} else if (medicionuno >= 35 && medicionuno < 50) {
			res =  2;
		} else if (medicionuno >= 50 && medicionuno < 70) {
			res =  2;
		} else if (medicionuno >= 70 && medicionuno < 90) {
			res =  3;
		} else if (medicionuno >= 90 && medicionuno <= 100) {
			res =  4;
		} else if (medicionuno > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;

	}

	public static int obtenerCorFunc (int mediciondos) {
		
		
		 int res = -1;
		
		if(mediciondos < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (mediciondos >= 0 && mediciondos < 10) {
			res =  0;
		} else if (mediciondos >= 10 && mediciondos < 35) {
			res =  1;
		} else if (mediciondos >= 35 && mediciondos < 50) {
			res =  1;
		} else if (mediciondos >= 50 && mediciondos < 70) {
			res =  2;
		} else if (mediciondos >= 70 && mediciondos < 90) {
			res =  3;
		} else if (mediciondos >= 90 && mediciondos <= 100) {
			res =  5;
		} else if (mediciondos > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;

	}

	public static int obtenerPertFunc (int mediciontres) {
		
		
		int res = -1;
		
		if(mediciontres < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (mediciontres >= 0 && mediciontres < 10) {
			res =  0;
		} else if (mediciontres >= 10 && mediciontres < 35) {
			res =  2;
		} else if (mediciontres >= 35 && mediciontres < 50) {
			res =  2;
		} else if (mediciontres >= 50 && mediciontres < 70) {
			res =  3;
		} else if (mediciontres >= 70 && mediciontres < 90) {
			res =  4;
		} else if (mediciontres >= 90 && mediciontres <= 100) {
			res =  5;
		} else if (mediciontres > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;

	}

	public static int obtenerAdecuacionFuncional (int compfunc, int corfunc, int pertfunc) {

		if(compfunc < 0 || corfunc < 0 || pertfunc < 0) {
			System.out.println("Error: Un parametro tiene un valor por debajo de lo permitido");
			System.exit(-1);
		}
		
		if(compfunc > 4 || corfunc > 5 || pertfunc > 5) {
			System.out.println("Error: Un parametro tiene un valor por encima de lo permitido");
			System.exit(-1);
		}
		
		int[] v = new int[] {compfunc, corfunc, pertfunc};
		
		int minimo = min(v);
		
		return minimo;
	}

	public static int obtenerModu (int medicioncuatro) {
		
		int res = -1;
		
		if(medicioncuatro < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (medicioncuatro >= 0 && medicioncuatro < 10) {
			res =  0;
		} else if (medicioncuatro >= 10 && medicioncuatro < 35) {
			res =  1;
		} else if (medicioncuatro >= 35 && medicioncuatro < 50) {
			res =  2;
		} else if (medicioncuatro >= 50 && medicioncuatro < 70) {
			res =  2;
		} else if (medicioncuatro >= 70 && medicioncuatro < 90) {
			res =  3;
		} else if (medicioncuatro >= 90 && medicioncuatro <= 100) {
			res =  4;
		} else if (medicioncuatro > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;

	}

	public static int obtenerReusa (int medicioncinco) {
		
		
		int res = -1;
		
		if(medicioncinco < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (medicioncinco >= 0 && medicioncinco < 10) {
			res =  0;
		} else if (medicioncinco >= 10 && medicioncinco < 35) {
			res =  1;
		} else if (medicioncinco >= 35 && medicioncinco < 50) {
			res =  2;
		} else if (medicioncinco >= 50 && medicioncinco < 70) {
			res =  2;
		} else if (medicioncinco >= 70 && medicioncinco < 90) {
			res =  3;
		} else if (medicioncinco >= 90 && medicioncinco <= 100) {
			res =  5;
		} else if (medicioncinco > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;

	}

	public static int obtenerAna (int medicionseis) {
		
		
		int res = -1;
		
		if(medicionseis < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (medicionseis >= 0 && medicionseis < 10) {
			res =  0;
		} else if (medicionseis >= 10 && medicionseis < 35) {
			res =  0;
		} else if (medicionseis >= 35 && medicionseis < 50) {
			res =  1;
		} else if (medicionseis >= 50 && medicionseis < 70) {
			res =  2;
		} else if (medicionseis >= 70 && medicionseis < 90) {
			res =  3;
		} else if (medicionseis >= 90 && medicionseis <= 100) {
			res =  5;
		} else if (medicionseis > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;

	}

	public static int obtenerCapModificacion (int medicionsiete) {
		
		
		int res = -1;
		
		if(medicionsiete < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (medicionsiete >= 0 && medicionsiete < 10) {
			res =  0;
		} else if (medicionsiete >= 10 && medicionsiete < 35) {
			res =  1;
		} else if (medicionsiete >= 35 && medicionsiete < 50) {
			res =  2;
		} else if (medicionsiete >= 50 && medicionsiete < 70) {
			res =  3;
		} else if (medicionsiete >= 70 && medicionsiete < 90) {
			res =  4;
		} else if (medicionsiete >= 90 && medicionsiete <= 100) {
			res =  5;
		} else if (medicionsiete > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;
	}

	public static int obtenerCapSerProbado(int medicionocho) {
		
		
		int res = -1;
		
		if(medicionocho < 0) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		} else if (medicionocho >= 0 && medicionocho < 10) {
			res =  0;
		} else if (medicionocho >= 10 && medicionocho < 35) {
			res =  1;
		} else if (medicionocho >= 35 && medicionocho < 50) {
			res =  1;
		} else if (medicionocho >= 50 && medicionocho < 70) {
			res =  2;
		} else if (medicionocho >= 70 && medicionocho < 90) {
			res =  4;
		} else if (medicionocho >= 90 && medicionocho <= 100) {
			res =  4;
		} else if (medicionocho > 100) {
			System.out.println("Error: El valor introducido no es valido. Fin de programa");
			System.exit(-1);
		}
		
		return res;
	}

	public static int obtenerMantenibilidad (int modularidad, int reusabilidad, int analizabilidad, int capmodificacion, int capserprobado) {

		if(modularidad < 0 ||reusabilidad < 0 ||analizabilidad< 0 ||capmodificacion <0 ||capserprobado<0){
			System.out.println("Error: Un parametro tiene un valor por debajo de lo permitido");
			System.exit(-1);
		}
		
		if(modularidad > 4 || reusabilidad > 5 || analizabilidad > 5 || capmodificacion > 5 || capserprobado > 4) {
			System.out.println("Error: Un parametro tiene un valor por encima de lo permitido");
			System.exit(-1);
		}
		
		int[] v = new int[] {modularidad, reusabilidad, analizabilidad, capmodificacion, capserprobado};
		
		int minimo = min(v);
		
		return minimo;
	}

	public static boolean evaluacionCalidad (int mantenibilidad, int adfuncional){
		
		int[] v = new int[] {mantenibilidad, adfuncional};
		
		int res = min(v);
		
		if (res >= 3) {
			return true;
		} else {
			return false;
		}
		
	}

	public static int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	}
	
	public static int leerCosas() throws Exception {
	
		int tecto = -1;
		
		try {
			Scanner tengohambre = new Scanner(System.in);  // Create a Scanner object
			tecto = tengohambre.nextInt();  // Read user input
			tengohambre.close();
		} catch (Exception e) {
			System.out.print("Error al insertar un valor. Fin.");
			System.exit(-1);
		}

		
		return tecto;
	}

}
