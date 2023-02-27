import java.util.Scanner;
import java.util.Random;

public class ClasificacionPersonas {
    
    static int nPersonas = 5;
    static Persona[] personas = new Persona[nPersonas];
    
    public static void leerDatos() {
        
         Scanner input = new Scanner(System.in);
         char respuesta;
         
         System.out.println("Desea introducir los datos manualmente o de forma aleatoria?");
         System.out.println("1. Aleatoria");
         System.out.println("2. Manualmente");
         int opcion = input.nextInt();
        
        if(opcion == 1){
            Random random = new Random();
            for (int i = 0; i < nPersonas; i++) {
                int edad_ = random.nextInt(99) + 1;
                char sexo_ = (Math.random() < 0.5) ? 'M' : 'F';
                personas[i] = new Persona(sexo_, edad_);
            }
        }else if (opcion == 2) {
            // Leer los datos de las 50 personas
            for (int i = 0; i < nPersonas; i++) {
                System.out.print("Ingrese el sexo de la persona " + (i+1) + " (M/F): ");
                char sexo = input.next().charAt(0);
                System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
                int edad = input.nextInt();
                personas[i] = new Persona(sexo, edad);
            }
         } else {
            System.out.println("Error");
            return;
         }
    }
    
    public static void mostrarDatos() {
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        
        for (int i = 0; i < nPersonas; i++) {
            Persona p = personas[i];
            if (p.getEdad() >= 18) {
                mayoresDeEdad++;
                if (p.getSexo() == 'M') {
                    hombresMayores++;
                } 
            } else {
                menoresDeEdad++;
                if (p.getSexo() == 'F') {
                    mujeresMenores++;
                }
            }
        }
        float porcentajeMayores = ((float)mayoresDeEdad / nPersonas) * 100.0f;
        float porcentajeMujeres = ((float)mujeresMenores / nPersonas) * 100.0f;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.printf("Porcentaje de personas mayores de edad: %.2f%% ", porcentajeMayores);
        System.out.printf("\nPorcentaje de mujeres: %.2f%% \n", porcentajeMujeres);
    }
    public static void main(String[] args) {
        leerDatos();
        mostrarDatos();
    }
}

class Persona {
    int edad;
    char sexo;

    public Persona(char sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
}