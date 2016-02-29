package colaboracionramas;

/**
 *
 * @author julianlinux
 */
public class Camion extends Vehiculo{
    private int nRodas;
/**
 * Constructor por defecto de la clase Camion. 
 */
    public Camion() {
        super();
    }
/**
 * Hereda los atributos de la clase Vehiculo a traves de la palabra reservada super.
 * @param cilindrada 
 * @param potencia
 * @param nRodas 
 */
    public Camion(int cilindrada, int potencia, int nRodas) {
        super(cilindrada, potencia);
        this.nRodas=nRodas;
    }
/**
 * Metodos de acceso a los atributos de la clase Camion
 * @return Devuelve el numero de ruedas del Camion
 */
    public int getnRodas() {
        return nRodas;
    }
/**
 * 
 * @param nRodas Recibe el numero de ruedas del camion
 */
    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
/**
 * 
 * @return Retorna el valor de los impuestos
 */
    public float calcularImposto(){
        return (getCilindrada()/30)+(getPotencia()*20)+(nRodas*20);
    }
    
    @Override
    public String toString() {
        return "Camion{" + "nRodas=" + nRodas + '}';
    }
    
}
}
