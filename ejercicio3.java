import java.util.Scanner;

public class CalcularSalarioTrabajador {
    
    static float leerHorasTrabajadas(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca las horas trabajadas: ");
        return input.nextFloat();
    }
        
    static float leerTarifa(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca la tarifa por hora: ");
        return input.nextFloat();
    }
    
    public static void main(String[] args) {
        
        float tarifa, horasTrabajadas, sueldo;
        
        horasTrabajadas = leerHorasTrabajadas();
        tarifa = leerTarifa();
        
        if (horasTrabajadas <= 40.0f) {
            sueldo = tarifa * horasTrabajadas;
        } else {
            float horasExtras = horasTrabajadas - 40.0f;
            horasExtras = horasExtras * (tarifa * 1.5f);
            sueldo = (40.0f * tarifa) + horasExtras;
        }
        
        System.out.println("El salario del trabajador en base las horas trabajadas y la tarifa es: " + sueldo + "$");
    }
}