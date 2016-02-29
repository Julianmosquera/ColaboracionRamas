package colaboracionramas;

/**
 *
 * @author julian
 */
public class Vehiculo {
    private String modelo,marca;
    private int cilindrada,numero_rudas;

    public Vehiculo(String modelo, String marca, int cilindrada, int numero_rudas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.numero_rudas = numero_rudas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumero_rudas() {
        return numero_rudas;
    }

    public void setNumero_rudas(int numero_rudas) {
        this.numero_rudas = numero_rudas;
    }
    
    public void arrancar(){
        System.out.println("En marcha");
    }
    public void frenar(){
        System.out.println("Detenido");
    }
}
