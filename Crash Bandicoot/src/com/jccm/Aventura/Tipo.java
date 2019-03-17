package com.jccm.Aventura;
import java.util.*;

public class Tipo implements Alerta {
	
	private ArrayList <Observer> Observadores;
	
	public Tipo() {
		Observadores = new ArrayList<Observer>();
		}		
	public void Advertir() {
			Alertar();
		}
	public void ConseguirHabilidad() {
		Alertar();
		}
	public void addObserver(Observer o) {
		Observadores.add((o));
		}
	
	@Override
	public void Alertar() {
		for (Observer o: Observadores) {
			o.update();
			
		}
	}
		
}


