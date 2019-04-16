public class 2
{
	public static void main(String [] ar)
	{
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un numero positivo");
		num=teclado.nextInt();
		if(num<10)
		{
			System.out.print("El numero ingresado tiene un digito");
		}
		if(num>=10)
		{
			System.out.print("El numero ingresado tiene dos digitos");
		}
		if(num>=100)
		{
			System.out.print("El numero ingresado tiene tres digitos");
		}
		if(num>=1000)
		{
			System.out.print("El numero ingresado tiene cuatro digitos");
		}
	}
}