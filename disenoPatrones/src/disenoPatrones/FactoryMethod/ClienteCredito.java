package disenoPatrones.FactoryMethod;

public class ClienteCredito extends Cliente
{
	protected Pedido creaPedido (double importe)
		{
			return new PedidoCredito(importe);
		}
}
