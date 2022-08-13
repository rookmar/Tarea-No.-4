public class Taller {


    private int retirar;
    private Vehiculo vehiculos[];
    int indice;

    /**
     * constructor sin parametros
     */
    public Taller() {

        this.retirar = retirar;
        vehiculos = new Vehiculo[1];
        indice=0;

    }

    /**
     *
     * @param ingresar metodo para ingresar un vehiculo
     */
  public void  IngresarCarro(Vehiculo ingresar){

        for(indice=0;indice<vehiculos.length;indice++){
            vehiculos[indice]=ingresar;
            System.out.println("se ingreso el vehiculo correctamente ");
        }

       // indice++;

    }

    /**
     *
     * @param mostrar metodo muestra los objetos de la clase vehiculo
     */
    public void MostrarCarro(Vehiculo mostrar){
        for (indice=0;indice<vehiculos.length;indice++){
            vehiculos[indice]=mostrar;
            System.out.println(vehiculos[indice].toString());
        }


    }

}
