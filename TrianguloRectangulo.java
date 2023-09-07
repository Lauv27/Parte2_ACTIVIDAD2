/**
* Esta clase define objetos que representan triángulos rectángulos con una
* base y una altura como atributos.
* @autor Laura Rincon, Sebastian Chidiak
*/
public class TrianguloRectangulo {
    int base; // Atributo que guarda la medida de la base de un triángulo rectángulo
    int altura; // Atributo que almacena la medida de la altura de un triángulo rectángulo
    
    /**
    * Constructor de la clase TrianguloRectangulo.
    * @param base Parámetro que se utiliza para definir la base de un triángulo
    * rectángulo.
    * @param altura Parámetro que se utiliza para definir la altura de un triángulo
    * rectángulo.
    */
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
    * Método que calcula el área de un triángulo rectángulo y devuelve el resultado.
    * El área se calcula multiplicando la base por la altura y dividiendo el resultado entre 2.
    * @return El área de un triángulo rectángulo.
    */
    double calcularArea() {
        return (base * altura / 2);
    }
    
    /**
    * Método que calcula el perímetro de un triángulo rectángulo y devuelve el resultado.
    * El perímetro se calcula sumando la base, la altura y la hipotenusa.
    * @return El perímetro de un triángulo rectángulo.
    */
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al
        método calcular hipotenusa */
    }                                                                                                                                                                                                                         
    
    /**
    * Método que calcula y devuelve la hipotenusa de un triángulo rectángulo utilizando
    * el teorema de Pitágoras.
    * @return La hipotenusa de un triángulo rectángulo.
    */
    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }
    
    /**
    * Método que determina el tipo de triángulo:
    * - Equilátero: si todos sus lados son iguales.
    * - Escaleno: si todos sus lados son diferentes.
    * - Isósceles: si dos de sus lados son iguales y el otro es diferente de los demás.
    */
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero"); // Todos sus lados son iguales
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno"); // Todos sus lados son diferentes
        else
            System.out.println("Es un triángulo isósceles"); // De otra manera, es isósceles
    }
}
