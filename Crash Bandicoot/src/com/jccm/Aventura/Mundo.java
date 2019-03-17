package com.jccm.Aventura;
import java.util.Scanner;

public class Mundo extends Acciones {

		int array[][] = new int [5][5];
		Scanner sc = new Scanner(System.in);
		String l = " ";
		String o = " ";{
			int x = 0;
			int y = 0;
		do {
			
			try { 
				o = sc.nextLine();
			}
			catch(Exception e){
				System.out.println("Error");
			}
			
			//Movimientos
			
			switch(o) {
			
			case "w": 
				if (x < 5) {
				array [0][0] = array [x++][y];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
					System.out.println("caistes en puas y no tenias mas vidas");
				}break;
				
			case "W": 
				if (x < 5) {
				array [0][0] = array [x++][y];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
					System.out.println("caistes en puas y no tenias mas vidas");
				}break;
						
			case "s": 
				if (x < 5) {
					array[0][0]= array[x--][y];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
					System.out.println("caistes en puas y no tenias mas vidas");
				}break;
				
			case "S": 
				if (x < 5) {
					array[0][0]= array[x--][y];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
					System.out.println("caistes en puas y no tenias mas vidas");
				}break;
			
			case "d": 
				if (y < 5) {
					array[0][0] = array[x][y++];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
					System.out.println("caistes en puas y no tenias mas vidas" );
				}break;
				
			case "D": 
				if (y < 5) {
					array[0][0] = array[x][y++];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
					System.out.println("caistes en puas y no tenias mas vidas" );
				}break;
				
			case "a":
				if(y < 5) {
					array[0][0] = array[x][y--];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
				System.out.println("caistes en puas y no tenias mas vidas");
				}break;
			
			case "A":
				if(y < 5) {
					array[0][0] = array[x][y--];
					System.out.println("Tu Posicion es " + x + " " + y);
				}
				else {
				System.out.println("caistes en puas y no tenias mas vidas");
			}break;


			}
			if(x==4 && y==4) {
				System.out.println("Lo lograste, crash ha llegado al portal sano y salvo");
				System.exit(0);
			}
			
			//Acciones 
			
			if(x==1 && y==0) {
				System.out.println("Conseguiste el tornado y lo haz desbloqueado");
					Tornado();
				}
			
			 
			if (x == 4 && y == 2) {
				System.out.println("Conseguite el pisoton y lo haz desbloqueado");	
					Pisoton();
					
			}
			
				
			//Enemigos
			
			if(x==2 && y==0 || x == 0 && y ==1 || x == 0 && y == 2 || x == 2 && y == 2) {
				Enemys("KillMonster");
			}
			
			if (x == 3 && y == 0 || x ==1 && y==1 || x ==3 && y==1 || x == 1 && y == 3 || x == 2 && y == 4 || x == 3 && y == 4 || x==3 && y == 3 || x == 4 && y == 3) {
				Enemys("NCortex");
			}
			
			//Pista 
			
			if (x == 4 && y == 1) {
				Aku aku = Aku.getInstance();
				aku.aku();
			}
			
			//Advertencias 
			
			if (x == 1 && y == 0 || x ==2 && y ==1 || x == 1 && y == 2) {
				System.out.println("Hay un mounstro cerca");
			}
			
			
		}while(o != "salir");
			
	}
	}
