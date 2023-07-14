package domain;

import interfaz.comida;
import interfaz.animal;

/**
 *
 * @author reych
 */
public class gato implements comida, animal {

    @Override
    public void hacerSonido() {
        System.out.println("miau");
    }

    @Override
    public void correr() {
        System.out.println("El gato corre sobre el techo");
    }

    @Override
    public void comer() {
        System.out.println("come croquetas");
    }

    @Override
    public void premios() {
        System.out.println("wiskas");
    }
    
}
