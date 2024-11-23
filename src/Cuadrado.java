//cuando extiende (implementa) de una interfaz se utiliza implements
                      //Para implementar mas de una interfaz, se separa por coma "," cada interfaz
                      //Herencia multiple
public class Cuadrado implements Figura, Dibujable{

    //Atributo de la clase
    private double lado;

    //Constructores
    public Cuadrado(){

    }
    public Cuadrado(double lado){
        this.lado = lado;
    }

    //Metodos getter and setter
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;

    }

    //Metodo abstracto de la interface Figura, pero lo implementara de forma distinta(Circulo)
    @Override//Override = Sobreescritura
    public double calcularArea() { //El metodo se implemetara "{}" de manera distinta en cada clase hija

        double areaCuadrado = lado * lado;
        return areaCuadrado;

    }

    //Se agrga la interfaz y se agrega los metodos abstractos
    @Override
    public void dibujar (){
        System.out.println("Hola estoy dibujando un cuadrado");
    }
}