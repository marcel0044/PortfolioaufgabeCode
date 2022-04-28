/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;
import Market.*;

/** Die Klasse FactoryPattern wird zur Objekterzeugung genutzt. 
 *  Somit muss in der Main nur der Methodenaufruf stattfinden. */
public class FactoryPattern {

    public static Thread getProducer() {
        return new Thread(new Producer());
    }

    public static Thread getConsumer() {
        return new Thread(new Consumer());
    }

    public static Thread getRessourceSupplier() {
        return new Thread(new ResourceSupplier());
    }
}




