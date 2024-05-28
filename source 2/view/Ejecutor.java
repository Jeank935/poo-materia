package view;
import controller.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejecutor {
    public static void main(String[] args) {
        String carrerasDemandadas[]={"Computacion","Medicina","Hembras"};
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(Arrays.asList(
        new Empleado("Computacion", 20, 2),
        new Empleado("Administracion de Empresas", 52, 10),
        new Empleado("Abogado", 40, 8),
        new Empleado("Hembras", 30,18),
        new Empleado("Medicina", 30, 7)));
        
        Empresa empresa1 = new Empresa(listaEmpleados);
        empresa1.asignarEstrellas(carrerasDemandadas);
        System.out.println(empresa1);
        
        }
    
}
 

