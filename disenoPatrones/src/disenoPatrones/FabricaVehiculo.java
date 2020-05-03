package disenoPatrones;

public interface FabricaVehiculo 
{
	Automovil creaAutomovil(String modelo, String color, int potencia, String espacio);
	Scooter   creaScooter(String modelo, String color, int potencia);	
}
