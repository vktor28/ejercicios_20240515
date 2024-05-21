import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class App {
    public static void main(String[] args) throws Exception {
/*
2- (medio) Ejercicio validación setter, y ArrayLists:
Tienes el objeto ClienteDiscoteca.
Tienes un arraylist de clientes discoteca ya creados.
Antes de añadir un cliente más en el arraylist, debes verificar
si el cliente tiene 18 años o más. Si es mayor de edad, se añade
el cliente, si no, se le da un mensaje de que no puede entrar.
Si es mayor de edad, imprimir nombre, edad y bienvenid@ a nuestra
discoteca.

+EXTRA: hacer esto en un bucle while (para salir escribe 'salir'),
y guardar dos arraylist, uno con los clientes aceptados y otro con
los rechazados. Mostrar ambos al final.
 * 
 */
ArrayList <Cliente> clientesOk = new ArrayList<>();
ArrayList <Cliente> clientesKo = new ArrayList<>();

Scanner teclado = new Scanner(System.in);
boolean colaEntrada = true;

while (colaEntrada) {
    System.out.println("Bienvenido a Costa Pesta");
    System.out.println("¿Cuál es tu nombre?");
    String nombre = teclado.nextLine();
    System.out.println("¿Cuál es tu apellido?");
    String apellido = teclado.nextLine();
    System.out.println("¿Cuántos años tienes?");
    int edad = teclado.nextInt();
    teclado.nextLine();
    if(edad>=18){
        clientesOk.add(new Cliente(nombre,apellido,edad));
    }
    else {clientesKo.add(new Cliente(nombre,apellido,edad));}
    System.out.println("Sigue habiendo cola?");
    if(teclado.nextLine().equalsIgnoreCase("SI")){
        colaEntrada=true;
    }else{
        colaEntrada=false;
        System.out.println("Cientes aceptados:");
        System.out.println(clientesOk.toString());
        System.out.println("Clientes rechazados:");
        System.out.println(clientesKo.toString());

    }
}


    }
}
