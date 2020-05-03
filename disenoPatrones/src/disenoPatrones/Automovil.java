package disenoPatrones;
// ver si baja
public abstract class Automovil {
	protected String modelo;
	protected String color;
	protected int potencia;
	protected String espacio;
	
	public Automovil  (String modelo, String color, int potencia, String espacio)
		{
			this.modelo=modelo;
			this.color=color;
			this.potencia=potencia;
			this.espacio=espacio;
		}
	public abstract void mostrarCaracteristicas(); 
}


