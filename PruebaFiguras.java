/**
* Esta clase realiza pruebas en diferentes figuras geométricas.
* @autor Laura Rincon, Sebastian Chidiak
*/
public class PruebaFiguras {
    /**
    * Método principal (main) que crea un círculo, un rectángulo, un cuadrado y
    * un triángulo rectángulo. Luego, calcula y muestra el área y el perímetro de cada figura.
    */
    public static void main(String args[]) {
        // Crear un objeto de tipo Círculo con radio 2
        Circulo figura1 = new Circulo(2);
        
        // Crear un objeto de tipo Rectangulo con base 1 y altura 2
        Rectangulo figura2 = new Rectangulo(1, 2);
        
        // Crear un objeto de tipo Cuadrado con lado 3
        Cuadrado figura3 = new Cuadrado(3);
        
        // Crear un objeto de tipo TrianguloRectangulo con base 3 y altura 5
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        
        // Calcular y mostrar el área y el perímetro del círculo
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        
        // Calcular y mostrar el área y el perímetro del rectángulo
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        
        // Calcular y mostrar el área y el perímetro del cuadrado
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        
        // Calcular y mostrar el área y el perímetro del triángulo rectángulo
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        
        // Determinar y mostrar el tipo de triángulo
        figura4.determinarTipoTriangulo();
    }
}
