/**
* Esta clase define objetos que representan círculos y almacena su radio como atributo.
* @autor Laura Rincon, Sebastian Chidiak
*/
public class Circulo {
    int radio; // Un atributo que guarda el valor del radio de un círculo
    
    /**
    * Constructor de la clase Circulo.
    * @param radio Parámetro que se utiliza para establecer el radio del círculo.
    */
    Circulo(int radio) {
        this.radio = radio;
    }
    
    /**
    * Método que calcula el área de un círculo y devuelve el resultado.
    * El área se calcula multiplicando el valor de pi por el cuadrado del radio.
    * @return El área de un círculo.
    */
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    /**
    * Método que calcula el perímetro de un círculo y devuelve el resultado.
    * El perímetro se calcula multiplicando el valor de pi por el radio y luego por 2.
    * @return El perímetro de un círculo.
    */
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
