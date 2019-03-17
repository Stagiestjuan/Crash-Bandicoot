package com.jccm.Aventura;
import java.util.*;

public class Acciones {
	
	String array[] = new String [1];
	Scanner sc = new Scanner(System.in);
	String o = " ";
	
	void Tornado() {
		array[0] = "Tornado";
		Habilidad ha = new KillMonster();
		ha.attack();
		Crash ch = new Crash();
		Tipo tp = new Tipo();
		
		tp.addObserver(ch);
		tp.ConseguirHabilidad();
		}
	
	void Pisoton() {
		array[0] = "Pisoton";
		Habilidad ha = new NCortex (new KillMonster());
		ha.attack();
		Tipo tp = new Tipo();
		Crash ch = new Crash();
		
		tp.addObserver(ch);
		tp.ConseguirHabilidad();
	}

	void Enemys(String Type) {
		if(Type == "KillMonster") {
			if(array[0] == "Tornado" || array[0]== "Pisoton") {
				System.out.println("Encontraste un moustro, lo has vencido");
			}
		}
		if(Type == "NCortex") {
			if (array[0] == "Pisoton") {
				System.out.println("Conseguiste al Doctor n Cortex, lo has vencido");
				
			}else {
				
				System.out.println("Encontraste a cortex y no tenias pisoton, te ha vencido");
				System.out.println("fin del juego");
				System.exit(0);

				}
			}
		
		}
	}	

