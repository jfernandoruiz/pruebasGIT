package disenoPatrones;

public class ScooterGasolina extends Scooter
{
	public ScooterGasolina (String modelo, String color, int potencia)
	{
		super (modelo,color,potencia);
	}
	public void mostrarCaracteristicas()
		{
			System.out.println("Automovil electrico modelo "+modelo+" de color "+color+" de potencia"+potencia);
		}
	
}
