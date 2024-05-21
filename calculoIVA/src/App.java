import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*
Diferentes tipos de IVA:
- General = 21% (ej. Ropa);
- Reducido = 10% (bono-metro);
- Super-reducido = 4% (huevos);
- Exento = 0% (dentista)
- Para el cálculo, hacer cuatro CONSTANTES para cada tipo de IVA.
- Pides el precio de producto, el tipo de IVA, y pasas estos dos parámetros a la función
calcularPrecioFinal(), y ésta te DEVUELVE el precio final (int o float), y se imprime en el main().

- Ejemplo: para el 21%, el precio final sería precioProducto + (precioProducto*0.21);
Ejemplo de constante para IVA21 = 0.21;
*/        
    System.out.println("Hello, World!");
    final double general = 21;
    final double reducido = 10;
    final double superReducido = 4;
    final double Exento = 0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qué precio tiene el producto?");
    double precioProducto=teclado.nextInt();
    teclado.nextLine();
    System.out.println("Qué tipo de IVA?\n1. 21% - General\n2. 10% - Reducido\n3. 4% - SuperReducido\n4. 0% - Exento tiene el producto");
    int ivaOpt = teclado.nextInt();
    double tipoIVA=0;
    teclado.nextLine();
    switch (ivaOpt) {
        case 1:
            tipoIVA=general;
            break;
        case 2:
            tipoIVA=reducido;
            break;
        case 3:
            tipoIVA=superReducido;
            break;
        case 4:
            tipoIVA=Exento;
            break;

    
        default:
            break;
    }
    
    System.out.println("El precio con IVA es: " + (float)Iva.calcularPrecioFinal(precioProducto, tipoIVA) + "€");

    teclado.close();
    }
}
