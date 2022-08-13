/**
 * Clase Vehiculo para crear los obejotos
 */

public class Vehiculo {

    private String modelo;
    private String marca;
    private String NumeroPlaca;

    /**
     * constructor con parametros
     * @param modelo atributo
     * @param marca atributo
     * @param numeroPlaca atributo
     */
    public Vehiculo(String modelo, String marca, String numeroPlaca) {
        this.modelo = modelo;
        this.marca = marca;
        NumeroPlaca = numeroPlaca;
    }

    /**
     *
     * @param modelo metodo seter
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @param marca metodo setet
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @param numeroPlaca metodo seter
     */
    public void setNumeroPlaca(String numeroPlaca) {
        NumeroPlaca = numeroPlaca;
    }

    /**
     *
     * @return metodos geter retorna la informacion
     */

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    /**
     *
     * @return tostring devuelo el contenido
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", NumeroPlaca='" + NumeroPlaca + '\'' +
                '}';
    }
}
