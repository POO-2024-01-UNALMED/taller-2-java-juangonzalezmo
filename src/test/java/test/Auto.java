package test;

public class Auto {
	
	public String modelo = null;
	public int precio = 0;
	public Asiento [] asientos;
	public String marca = null;
	public Motor motor = null;
	public int registro = 0;
	public static int cantidadCreados = 0;
	
	public int cantidadAsientos() {
		
		return this.asientos.length;
	}
	
	public String verificarIntegridad() {
		
		boolean veracidad=false;
		for(int i=0; i<this.asientos.length; i++) {
			
			if (this.registro==this.motor.registro && this.registro==this.asientos[i].registro) {
				
				veracidad = true;
			}
			
			else {
				
				veracidad = false;
				break;
			}
		}
		
		if (veracidad==true) {
			
			return "Auto original";
		}
		
		else {
			
			return "Las piezas no son originales";
		}
	}
}
