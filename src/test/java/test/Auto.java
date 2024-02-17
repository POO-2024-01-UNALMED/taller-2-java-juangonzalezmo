package test;

public class Auto {
	
	public String modelo;
	public int precio;
	public Asiento [] asientos= new Asiento[6];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
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
