package disenoPatrones;

public class AutomovilGasolina extends Automovil
{
	public AutomovilGasolina (String modelo, String color, int potencia, String espacio)
	{
		super (modelo,color,potencia,espacio);
	}
	public void mostrarCaracteristicas()
		{
			System.out.println("Automovil gasolina modelo "+modelo+" de color "+color+" de potencia"+potencia+" de espacio "+espacio);
		}
}
