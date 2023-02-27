import java.util.Scanner;

class NumeroParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par ");
            for (int i = numero; i >= 0; i -= 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("El numero ingresado es impar ");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.print(i + " ");
            }
        }
    }
}