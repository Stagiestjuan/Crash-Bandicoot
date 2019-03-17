package com.jccm.Aventura;

public class NCortex extends SuperHabilidad{
	
	public NCortex(Habilidad ha) {
		super(ha);
	}
	
	@Override
	public void attack() {
		System.out.println("¿Preparado Para Vencer a cortex?");
		getHabilidad().attack();
	}
}
