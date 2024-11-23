//cuando extiende (implementa) de una interfaz se utiliza implements
                    //Para implementar mas de una interfaz, se separa por coma "," cada interfaz
                    //Herencia multiple
public class Circulo implements Figura, Rotable, Dibujable {

    //Atributos
    private double radio;

    //Constructores
    public Circulo(){

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metados getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodo abstracto de la interface Figura, pero lo implementara de forma distinta(Circulo)
    @Override //Override = Sobreescritura
    public double calcularArea() {//El metodo se implemetara "{}" de manera distinta en cada clase hija

        double pi = 3.1416;
        double areaCirculo = pi * radio + radio ;

        return areaCirculo;
    }
    //Se escribe el metodo de manera normal y arriba la anotacion @Override "Sobrescribir"

    //Los metodos abstractos son sobrescritos "@Override"
    @Override
    public void rotar (){

        System.out.println("Estoy rotando un circulo");
    }

    @Override
    public void dibujar (){
        System.out.println("Estoy dibujando un circulo");
    }
}
