package domain;

import interfaz.comida;
import interfaz.animal;

/**
 *
 * @author reych
 */
public class perro implements animal, comida{

    @Override
    public void hacerSonido() {
        System.out.println("guau");
    }

    @Override
    public void correr() {
        System.out.println("El perro corre en la calle");
    }

    @Override
    public void comer() {
        System.out.println("come croquetas");
    }

    @Override
    public void premios() {
        System.out.println("come huecito");
    }
    
    
}
