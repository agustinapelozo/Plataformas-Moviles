import java.util.Scanner;

public class 2
{
    public static void main(String args[])
    { 
        Scanner teclado=new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float promedio;
        System.out.print("Ingrese el nombre del alumno:");
        nombre=teclado.nextInt();
        System.out.print("Ingresar la primera nota:");
		nota1=teclado.nextInt();
		System.out.print("Ingresar la segunda nota:");
		nota2=teclado.nextInt();
        System.out.print("Ingresar la tercera nota:");
        nota3=teclado.nextInt();
        promedio=(nota1 + nota2 + nota3)/3;
        System.out.print("El promedio de:"+ nombre, "es:"+ promedio);
    }
}