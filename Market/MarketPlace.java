package Market;

/** Die Klasse MarketPlace stellt den Marktplatz dar. Sie ist als unabhängiger Thread realisiert.
 *  Hier werden Rohstoffe an die Produzenten geliefert und 
 *  anschließend die erzeugten Produkte an die Konsumenten verkauft.
 */
public class MarketPlace extends Thread {
	
	/** Die Attribute tisch und stuhl vom Typ int sind die Produkte, 
	 *  die die Produzenten produzieren und an den Marktplatz liefern 
	 *  und anschließend an die Endverbraucher (Konsumenten) verkaufen.
	 */
	volatile static int tisch = 0;
	volatile static int stuhl = 0;
        	
	/** Die folgenden Attribute stellen die Ressourcen dar, die bei der Produktion
	 *  der Produkte Tische und Stühle verbaucht werden. 
	 *  Sie werden vom Rohstofflieferant (ResourceSupplier) an den Marktplatz geliefert.
	 */
	volatile static int eichenholz = 0;
	volatile static int birkenholz = 0;
	volatile static int fichtenholz = 0;
	volatile static int akazienholz = 0;  
	volatile static int tropenholz = 0;
	
	/** Das Attribut sleepTime legt die "Schlafenszeit / Pausierung" der Threads fest */
	static int sleepTime = 6000;
}
