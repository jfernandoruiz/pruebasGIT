package disenoPatrones;

public class FabricaVehiculoGasolina implements FabricaVehiculo{
	
	public Automovil creaAutomovil(String modelo, String color, int potencia, String espacio)
		{
			return new AutomovilGasolina(modelo, color, potencia, espacio);
		}
	public Scooter creaScooter(String modelo, String color, int potencia)
		{
			return new ScooterGasolina(modelo, color, potencia);
		}
}
	