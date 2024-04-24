
package dfsdgf;
import java.util.Scanner;
public class Dfsdgf {

    public static void main(String[] args) {
        //Transporte transporte = new Transporte();
        Scanner tcl = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo("azul", 180, 2,4);
        vehiculo.cambiarMarcha();
        vehiculo.validarVehiculo();
        System.out.println("ingrese las llantas");
        int llantaz = tcl.nextInt();
        vehiculo.validarVehiculo2(llantaz);
    }
   
    
}
