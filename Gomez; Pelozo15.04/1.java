/*Utilizamos este metodo porque no entendimos los ejemplos*/
import java.util.Scanner;

public class 1
{
    public static void main(String args[])
    { 
        Scanner teclado=new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        int rest;
        int divi;
        int mult;
        System.out.print("Ingresar el primer numero");
		num1=teclado.nextInt();
		System.out.print("Ingresar el segundo numero");
		num2=teclado.nextInt();
        divi=num1 / num2;
        mult=num1 * num2;
        suma=num1 + num2;
        rest=num1 - num2;
        System.out.print("El resultado de la suma es:"+ suma, "\n El resultado de la resta es:"+ rest, "\n El resultado de la division es:"+ divi, "\nEl resultado de la multiplicacion es:"+ mult);

    }
}