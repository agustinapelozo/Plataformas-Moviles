/*Utilizamos este metodo porque no entendimos los ejemplos*/
import java.util.Scanner;

public class 8
{
    public static void main(String args[])
    { 
        Scanner teclado=new Scanner(System.in);
        char nom;
        int edad;
        int sueldo;
        System.out.print("Ingresar su nombre");
		nom=teclado.nextInt();
		System.out.print("Ingresar su edad");
		edad=teclado.nextInt();
		System.out.print("Ingresar su sueldo");
		sueldo=teclado.nextInt();
		System.out.print("El nombre es:"+ nombre +" y la edad es"+ edad +"y el sueldo es"+ sueldo +);
    }
}