package test;

public class Auto {
	
	public String modelo;
	public int precio;
	public Asiento [] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		
		int i=0;
        for (int j = 0;j<asientos.length;j++) {
            if( asientos[j] instanceof Asiento  ) {
                i++;
            }
        }
        return i;
	}
	
	public String verificarIntegridad() {
		
		boolean veracidad=false;
		for(int i=0; i<this.asientos.length; i++) {
			
			
			if (asientos[i] instanceof Asiento) {
			
				if (this.registro==this.motor.registro && this.registro==this.asientos[i].registro) {
					
					veracidad = true;
				}
				
				else {
					
					veracidad = false;
					break;
				}
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
