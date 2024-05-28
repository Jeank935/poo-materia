package model;
import controller.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class leerEmpleados {
    ObjectInputStream flujoSalida;
    FileInputStream path;
    ArrayList<Empleado> listaEmpleados;

    public leerEmpleados(ObjectInputStream flujoSalida, FileInputStream path, ArrayList<Empleado> listaEmpleados) {
        this.flujoSalida = flujoSalida;
        this.path = path;
        this.listaEmpleados = listaEmpleados;
    }

}
