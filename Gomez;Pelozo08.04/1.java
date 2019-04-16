public class 1
{
	public static void main(String [] ar)
	{
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		float precio;
		float montoapagar;
		System.out.print("Ingrese la cantidad de articulo");
		cantidad=teclado.nextInt();
		System.out.print("Ingrese el valor unitario");
		precio=teclado.nextFloat();
		montoapagar=precio*cantidad;
		System.out.print("El total a pagar es:");
		System.out.print(montoapagar);
	}
}