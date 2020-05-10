package disenoPatrones.FactoryMethod;


	public class PedidoCredito extends Pedido
	{
		public  PedidoCredito(double importe)
			{
				super(importe);
			}
		public void paga()
				{
					System.out.println("El pago del pedido a credito por importe de "+importe+" se ha realizado");
				}
		public  boolean valida()
				{
					return (importe>=1000.0) && (importe <=5000.0);
				}
		
	}


