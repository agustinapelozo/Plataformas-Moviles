import java.util.Scanner;

public class 2
{
    public static void main(String args[])
    { 
        Scanner teclado=new Scanner(System.in);
        int horas;
        int sueldo;
        System.out.print("Ingrese su nombre:");
        nombre=teclado.nextInt();
        System.out.print("Ingresar la cantidad de horas trabajadas:");
        horas=teclado.nextInt();
        sueldo=horas * 400;
        System.out.print("El sueldo de:"+ nombre, "es:"+ sueldo);
    }
}