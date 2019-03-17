package com.jccm.Aventura;

public abstract class SuperHabilidad implements Habilidad{

private Habilidad ha;
	
	public SuperHabilidad(Habilidad ha) {
		this.ha = ha;
		
	}
	
	protected Habilidad getHabilidad() {
		return ha;
	}
	
}