package ejer.ejerciciosclases.java;

public class jerarquiafigura {
    protected String nombre;

    public jerarquiafigura(String nombre) {
        this.nombre = nombre;
    }
    public class Circulo extends jerarquiafigura {
        private double radio;

        public Circulo(double radio) {
            super("Círculo");
            this.radio = radio;
        }
    }
    public class Rectangulo extends jerarquiafigura {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            super("Rectángulo");
            this.base = base;
            this.altura = altura;
        }
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("Figura: " + circulo.nombre + ", Radio: " + circulo.radio);
        System.out.println("Figura: " + rectangulo.nombre + ", Base: " + rectangulo.base + ", Altura: " + rectangulo.altura);
    }
    // Se decidió impedir la instanciación directa de la clase base (jerarquiafigura)
    // declarándola como "abstract". Esto es porque conceptualmente no tiene sentido
    // crear un objeto "Figura" genérico sin forma definida: siempre debe ser un
    // Círculo, un Rectángulo, etc. La clase abstracta obliga a que solo existan
    // instancias de sus subclases concretas, manteniendo el modelo coherente.
}
/*Ejercicio 2 (intermedio). Modelar la jerarquía Figura (nombre) con subclases Circulo (radio) y Rectangulo
 (base, altura), cada una con constructor propio que invoque a super(nombre) pasando el nombre correspondiente (“Círculo”, “Rectángulo”).
  Documentar en un comentario si se decidió o no impedir la instanciación directa de Figura en esta clase, y por qué
   (la herramienta formal para eso, la clase abstracta, recién se ve en la Clase 7).*/
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
}

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super("Triángulo");
        // Validación de la desigualdad triangular: la suma de dos lados
        // cualesquiera debe ser siempre mayor que el tercero. Si no se
        // cumple, no es posible formar un triángulo válido.
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            throw new IllegalArgumentException("Los lados no cumplen la desigualdad triangular");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        // Fórmula de Herón
        double s = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
}

public class Main {
    // Este método recibe un Figura[] y no conoce de antemano qué subtipos
    // contiene. Gracias al binding dinámico, cada llamada a calcularArea()
    // ejecuta la implementación correcta según el tipo real de cada objeto.
    public static double calcularAreaTotal(Figura[] figuras) {
        double total = 0;
        for (Figura figura : figuras) {
            total += figura.calcularArea();
        }
        return total;
    }

    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        figuras[2] = new Triangulo(3.0, 4.0, 5.0);

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.nombre + ", Área: " + figura.calcularArea());
        }

        System.out.println("Área total: " + calcularAreaTotal(figuras));
    }
}