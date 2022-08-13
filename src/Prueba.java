import com.sun.security.jgss.GSSUtil;

import java.util.Objects;
import java.util.Scanner;

/**
 * Program para ingresar vehiculos
 */
public class Prueba {
    /**
     *
     * @param args metodo para que funcione el programa
     */
    public static void main(String[] args) {
/**
 * ingresar los vehiculos por medio del constructor
 *
 */
        Vehiculo carro = new Vehiculo("2015","honda","dpr145");
        Taller taller1 = new Taller();
        taller1.IngresarCarro(carro);
        Vehiculo carro1=new Vehiculo("2020","Ford","mjs587");

        Vehiculo carro2=new Vehiculo("2010","mazda","kls584");
        Vehiculo carro3=new Vehiculo("2022","toyota","lpr548");
        Vehiculo carro4=new Vehiculo("2000","suzuki","prt584");
        taller1.IngresarCarro(carro1);
        taller1.IngresarCarro(carro2);
        taller1.IngresarCarro(carro3);
        taller1.IngresarCarro(carro4);

        taller1.MostrarCarro(carro);
        taller1.MostrarCarro(carro1);
        taller1.MostrarCarro(carro2);
        taller1.MostrarCarro(carro3);
        taller1.MostrarCarro(carro4);








    }
}
