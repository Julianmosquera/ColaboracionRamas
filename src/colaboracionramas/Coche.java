package colaboracionramas;

/**
 *
 * @author julianlinux
 */
public class Coche extends Vehiculo {

    boolean nivel_aceite = true;

    public Coche(String modelo, String marca, int cilindrada, int numero_rudas) {
        super(modelo, marca, cilindrada, numero_rudas);
    }

    public void comprobarAceite() {
        if (nivel_aceite = true) {
            System.out.println("Correcto");

        } else {
            System.out.println("Taller");
        }

    }

}
