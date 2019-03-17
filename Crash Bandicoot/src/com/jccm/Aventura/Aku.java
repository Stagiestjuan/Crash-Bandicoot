package com.jccm.Aventura;

public class Aku {
	
	private static Aku aku;
	
	private Aku() {
		
	}
	public static Aku getInstance() {
		
		if(aku == null) {
			aku = new Aku();
			}
		return aku;
		}
	public void aku() {
		System.out.println("te has encontrado a aku aku y te dice: He estado en la parte derecha del mundo, deberias echar un vistazo");
		
	}
}
