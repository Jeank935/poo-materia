package estructurasrepitituvas;

import java.util.Scanner;

public class Ejecutor_Terreno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean opcion = true;
        String rsp = null;
        while(opcion){
            System.out.println("Dame el alto, ancho y vmc");
            Terreno t1 = new Terreno(tcl.nextDouble(),tcl.nextDouble(),tcl.nextDouble());
        t1.calcularArea();
        t1.calcularCostoFinal();
        t1.descuento();
        System.out.println(t1);
        if(t1.getArea()>200&&t1.getArea()<300){
            System.out.println("FELICIDADES GANO UN 10% DESCUENTO");
        }else if(t1.getArea()>300){
            System.out.println("FELICIDADES GANO UN 20% DESCUENTO");
        }
            System.out.println("DESEA INGRASAR MAS(S/N)");
            rsp = tcl.next();
            if(rsp.equals("N")) break;
        }
     }
}
class Terreno{
    public double alto;
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;
    public double precioDescuento;

    
    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;}    
    public void calcularArea(){
        this.area = this.alto * this.ancho;
}
    public void calcularCostoFinal(){
        this.costoFinal = area*vmc;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getArea() {
        return area;
    }
    public void descuento(){
        this.precioDescuento = (this.area>200&&this.area<300?this.costoFinal-(this.costoFinal*0.10):this.costoFinal);
        this.precioDescuento = (this.area>300?this.costoFinal-(this.costoFinal*0.20):this.costoFinal);
        
    }
    
    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal +",precioDescuento="+precioDescuento+ '}';
    }
}