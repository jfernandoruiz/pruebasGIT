package disenoPatrones;

public class AutomovilElectricidad extends Automovil 
{
	public AutomovilElectricidad (String modelo, String color, int potencia, String espacio)
	{
		super (modelo,color,potencia,espacio);
	}
	public void mostrarCaracteristicas()
		{
			System.out.println("Automovil electrico modelo "+modelo+" de color "+color+" de potencia"+potencia+" de espacio "+espacio);
		}
}
