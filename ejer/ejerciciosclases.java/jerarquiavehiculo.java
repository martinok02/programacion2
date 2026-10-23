package ejer.ejerciciosclases.java;

public class jerarquiavehiculo {
  String marca;
  int modelo;
  int anio;
  public jerarquiavehiculo(String marca, int modelo, int anio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }
  public String toString() {
    return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
  }
  super public class Auto extends jerarquiavehiculo {
    private int cantidadPuertas;

    public Auto(String marca, int modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de puertas: " + cantidadPuertas;
    }
    public class Moto extends jerarquiavehiculo {
        private int cilindrada;

        public Moto(String marca, int modelo, int anio, int cilindrada) {
            super(marca, modelo, anio);
            this.cilindrada = cilindrada;
        }

        @Override
        public String toString() {
            return super.toString() + ", Cilindrada: " + cilindrada + " cc";
        }
    }
      
}
 /**En la jerarquía Vehiculo (marca, modelo, año) con subclases Auto (cantidad de puertas) y Moto (cilindrada)
 , sobreescribir toString() en ambas subclases de forma que reutilicen super.toString()
  para la parte común y solo agreguen su atributo específico, sin repetir marca/modelo/año en el texto.
*/