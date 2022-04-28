
package Market;

/** Die Klasse ResourceSupplier stammt von der Klasse Thread ab und 
 *  beschreibt die Lieferung von verschiedenen Rohstoffen an den Marktplatz.
 *  Sie stellt somit die Rohstofflieferanten dar.
 */
public class ResourceSupplier extends Thread {
	private int sleepCounter = 1;
        
	NewJFrame frame = new NewJFrame();
	
	public void run() {
		while(this.sleepCounter <= 20) {           
			this.distributeResource(this.generateRandom());
		
			try {
				Thread.sleep(MarketPlace.sleepTime);  
				this.sleepCounter++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
		}
	}
	
	/** Die Methode distributeResource liefert die Rohstoffe an den Marktplatz.
	 *  Der Rohstofftyp ist dabei zufällig und es werden pro Lieferung zwischen 5 und 10 Rohstoffe geliefert. */
	private void distributeResource(int prodNr) {	
		// Schleife läuft zweimal durch, da immer zwei Rohstofftypen pro Zeiteinheit in einer Menge von 5-10 Einheiten geliefert werden.
		for(int i=1; i<=2; i++) {
			switch(prodNr) {
		    	case 1: {
		    		MarketPlace.eichenholz = this.resourceM(MarketPlace.eichenholz, "Eichenholz");
                    break;
	    		}
	    		case 2: {
	    			MarketPlace.tropenholz = this.resourceM(MarketPlace.tropenholz, "Tropenholz");
	    			break;
    			}
	    		case 3: {
	    			MarketPlace.akazienholz = this.resourceM(MarketPlace.akazienholz, "Akazienholz");
	    			break;
    			}
	    		case 4: {
	    			MarketPlace.birkenholz = this.resourceM(MarketPlace.birkenholz, "Birkenholz");
	    			break;
    			}
	    		case 5: {
	    			MarketPlace.fichtenholz = this.resourceM(MarketPlace.fichtenholz, "Fichtenholz");
	    			break;
    			}
	    	}
		}
	}
	
	/** zufällig wird ein case aus den in distributeResource(int prodNr) ausgewählt. */
	public int generateRandom() {
		double rand = Math.random()*5;
		rand = Math.ceil(rand);
		return (int)rand;
	}
	
	/** zufällig werden Rohstoff-Einheiten in einer Menge von 5-10 geliefert. */
	public int generateUnit() {
		double rand2 = Math.random()*5 + 5;
		rand2 = Math.ceil(rand2);
		return (int)rand2;
	}	
	
	public int resourceM(int resourceMarketPlace, String type) {
		int random = this.generateUnit();
		resourceMarketPlace += random;
		int resource = resourceMarketPlace;
		frame.show();
		frame.showMessageR(type + " wurde " + random + " mal" + " geliefert!" + "\n" + type + ": " + resource);
		System.out.println(type + " wurde " + random + " mal" + " geliefert!" + "\n" + type + ": " + resource);
		return resourceMarketPlace;
	}
}
