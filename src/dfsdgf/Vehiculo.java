package dfsdgf;

public class Vehiculo {
    String color;
    int velocidad;
    int traccion;
    int llantas;
    public Vehiculo(String color, int velocidad, int traccion,int llantas){
        this.color = color;
        this.velocidad = velocidad;
        this.traccion = traccion;
        this.llantas = llantas;
            System.out.println("EL COLOR DEL VEHICULO ES: "+color+" VA A UNA VELOCIDAD DE " + velocidad+"KM/H" + " Y SU TRACCION ES: "+traccion +""+ llantas);
    }
    
    public void subirVelocidad(){
        System.out.println("Subir velocidad");
    }
    public void bajarVelocidad(){
        System.out.println("bajar velocidad");
    }
    public void cambiarMarcha(){
        System.out.println("cambiar marcha "+ velocidad);
    }
    public void validarVehiculo(){
        if(llantas ==2){
            System.out.println("El vehiculo es una moto");
        }else if(llantas == 4){
            System.out.println("El vehiculo es un carro");
        }else if (llantas ==6){
            System.out.println("El vehiculo es un camion");
        }
    }
    public void validarVehiculo2(int llantaz){
        if(llantaz ==2){
            System.out.println("El vehiculo es una moto");
        }else if(llantaz == 4){
            System.out.println("El vehiculo es un carro");
        }else if (llantaz ==6){
            System.out.println("El vehiculo es un camion");
        }
    }
    
}
