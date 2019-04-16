import java.util.Scanner;
public class punto6 {
                private Scanner teclado;
                private String nombre;
                private int sueldo;
                public void carga() {
                teclado=new Scanner(System.in);
                System.out.print("Ingrese nombre:");
                nombre=teclado.next();
                System.out.print("Ingrese su sueldo:");
                edad=teclado.nextInt();
                }
                public void imprimir() {
                System.out.println("Nombre:"+nombre);
                System.out.println("Edad:"+sueldo);
                }

                public void impuestos() {
                if (sueldo>3000) {
                System.out.print(nombre+" Debe pagar impuestos.");
                } 
                }

                public static void main(String[] ar) {
                punto6 empleado1;
                empleado1=new punto6();
                empleado1.carga();
                empleado1.imprimir();
                empleado1.impuestos();
                }
                }
