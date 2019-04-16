public class 5
{
	public static void main(String [] ar)
	{
		Scanner teclado=new Scanner(System.in);
		int num;
		int suma;
		while(num!=9999)
		{
			System.out.print("Ingrese un numero");
			num=teclado.nextInt();
			suma=num + num;
		}
		System.out.print("Terminado");
		if(suma==0)
		{
			System.out.print("El valor acumulado es igual a 0" + suma);
		}
		if(suma>0)
		{
			System.out.print("El valor acumulado es mayor a 0" + suma);
		}
		if(suma<0)
		{
			System.out.print("El valor acumulado es menor a 0" + suma);
		}
	}
}