/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;
import Market.MarketPlace;

/** Es wird ein Objekt von MarketPlace erzeugt und in der Main durch die Methode zurückgegeben.
 *  Der MarketPlace kann es somit nur einmal eindeutig existieren. */
public class SingleMarket {
    private static Thread m = new Thread(new MarketPlace());

    public static Thread getMarket() {
        return m;
    }
    
}
