package com.jccm.Aventura;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("El Mundo de Crash");
		System.out.println("Crash esta atrapado en un mundo 5x5 en donde la unica salida es un portal que lo lleva a su isla bandicoot, ayuda a crash a llegar el portal evitando los mounstros y al Dr. Cortex");
		System.out.println("Instrucciones: W para avanzar, A para la izquierda, S para retroceder, D para la derecha");
		System.out.println("hay dos habilidades perdida de Crash, una es el tornado que le sirve para derrotar a los mounstros del mundo, y el super pisoton para vencer a cortex");
		System.out.println("El juego comienza cuando presione Enter");
	
		Scanner sc = new Scanner(System.in);
		String o = " ";
		
		try {
			o = sc.nextLine();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
		if (o == " ");{
			System.out.println("Inicio del Juego");
			System.out.println("Movimiento:");
			Mundo mu = new Mundo();
		}	
	}
}
