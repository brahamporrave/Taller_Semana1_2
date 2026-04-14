package POO;

import java.util.Scanner;

// Caso 1: Calculadora

public class Caso1 {
    public static  void main(String[] args)
    {
        // Calculadora
        System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n");
        Scanner option = new Scanner(System.in);
        int opcion = option.nextInt();

        Scanner numeros = new Scanner(System.in);
        System.out.print("Ingresa el valor del primer numero: ");
        float a = numeros.nextFloat();
        System.out.print("Ingresa el valor del segundo numero: ");
        float b = numeros.nextFloat();

        switch(opcion)
        {
            case 1:
                float Suma = a + b;
                System.out.println(Suma);
                break;

            case 2:
                    float Resta = a - b;
                    System.out.println(Resta);
                    break;
            case 3:

                float Multiplicacion = a * b;
                System.out.println(Multiplicacion);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    float Division = a / b;
                    System.out.println(Division);
                    break;
                }
            default:
                System.out.println("ingrese una opcion valida");
                break;
        }

        numeros.close();
    }
}
