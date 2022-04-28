package Market;

/** Die Klasse Consumer stammt von der Klasse Thread ab und 
 *  beschreibt den Kauf der Produkte Tisch und Stuhl und die jeweilige Anzahl auf dem Marktplatz.
 */
public class Consumer extends Thread {
	private int sleepCounter = 1;
        
    NewJFrame frameC = new NewJFrame();
	
	public void run() {
		while(this.sleepCounter <= 20) { 
			this.buyProduct(this.generateRand());
			
			try {
				Thread.sleep(MarketPlace.sleepTime);
				this.sleepCounter++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
	}
	
	/** Methode zum Kaufen eines Tisches durch den Konsument vom Marktplatz.
	 *  Der Kauf der Produktart ist zufällig und die Einheiten der Produkte werden zufällig zwischen 3 und 5 Einheiten bestimmt*/
	private void buyProduct(int prodNr) {
		switch(prodNr) {
			case 1: {
				MarketPlace.tisch = this.product(MarketPlace.tisch, "Tisch");
			}
			case 2: {
				MarketPlace.stuhl = this.product(MarketPlace.stuhl, "Stuhl");
			}
		}
	}	
	
	public int generateRand() {
		double rand = Math.random()*2;
		return (int)rand;
	}
	
	public int generateUnit() {
		double rand2 = Math.random()*3 + 2;
		rand2 = Math.ceil(rand2);
		return (int)rand2;
	}
	
	public int product(int productType, String productName) {
		int amount = this.generateUnit();
		if(amount <= productType && productType > 0) {
			productType -= amount;
			  frameC.show();
              frameC.showMessageC(productName + " wurde " + amount + " mal gekauft! \n" + 
              					  "Übrige Menge: " + productType);
			  System.out.println(productName + " wurde " + amount + " mal gekauft! \n" + 
								 "Übrige Menge: " + productType);
			} else {
              frameC.show();
              frameC.showMessageC("--> kein " + productName + " vorhanden");
			  System.out.println("--> kein " + productName + " vorhanden");
			}
		return productType;
		}
	}

