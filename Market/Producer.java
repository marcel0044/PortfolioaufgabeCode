package Market;

/** Die Klasse Producer stammt von der Klasse Thread ab und 
 *  beschreibt die Produktion der Produkte Tisch und Stuhl und 
 *  die anschließende Lieferung an den Marktplatz.
 */
public class Producer extends Thread {
	private int sleepCounter = 1;
        
    NewJFrame frameP = new NewJFrame();
        
	public void run() {
		while(this.sleepCounter <= 20) {
			this.prodStuhl();
			this.prodTisch();
			this.prodStuhl();
			this.prodTisch();
			
			try {
				Thread.sleep(MarketPlace.sleepTime); 
				this.sleepCounter++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}     
		}
	}
	
	/** Die Methode prodTisch produziert Tische mit den Ressourcen Tropenholz, Fichtenholz und Akazienholz. */
	private void prodTisch() {
		/** Tisch wird nur produziert, wenn mindestens eine Ressource vom Typ 
		 *  Tropenholz, Fichtenholz und Akazienholz an den Marktplatz geliefert wurden! */
		if (MarketPlace.tropenholz > 0 && MarketPlace.fichtenholz > 0 && MarketPlace.akazienholz > 0) {
			MarketPlace.tisch++;
			MarketPlace.tropenholz--;
			MarketPlace.fichtenholz--;
			MarketPlace.akazienholz--;
            frameP.show();
            frameP.showMessageP("Die Rohstoffe Tropenholz, Fichtenholz und Akazienholz wurden verbraucht. \n" +
            					"Ein Tisch wurde erzeugt und an den Marktplatz geliefert! \n" + "Tisch: " + MarketPlace.tisch);
			System.out.println("Die Rohstoffe Tropenholz, Fichtenholz und Akazienholz wurden verbraucht. \n" +
							   "Ein Tisch wurde erzeugt und an den Marktplatz geliefert! \n" + "Tisch: " + MarketPlace.tisch);
		}
	}
	
	/** Die Methode prodStuhl produziert Stühle mit den Ressourcen Birkenholz und Eichenholz. */
	private void prodStuhl() {
		/** Tisch wird nur produziert, wenn mindestens eine Ressource vom Typ 
		 *  Birkenholz und Eichenholz an den Marktplatz geliefert wurden! */
		if (MarketPlace.birkenholz > 0 && MarketPlace.eichenholz > 0) {
				MarketPlace.stuhl++;
				MarketPlace.birkenholz--;
				MarketPlace.eichenholz--;
                frameP.show();
                frameP.showMessageP("Die Rohstoffe Birkenholz und Eichenholz wurden verbraucht. \n" +
                					"Ein Stuhl wurde erzeugt und an den Marktplatz geliefert! \n" + "Stuhl: " + MarketPlace.stuhl);
				System.out.println("Die Rohstoffe Birkenholz und Eichenholz wurden verbraucht. \n" +
								   "Ein Stuhl wurde erzeugt und an den Marktplatz geliefert! \n" + "Stuhl: " + MarketPlace.stuhl);
		}
	}
}
