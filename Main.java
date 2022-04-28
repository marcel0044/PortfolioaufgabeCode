
import Pattern.FactoryPattern;
import Pattern.SingleMarket;

/** Hier werden lediglich die Objekte durch die Methodenaufrufe erzeugt. */
public class Main {

	public static void main(String[] args) {

		/** Es wird ein Marktplatz der Klasse SingleMarket als Thread erzeugt und
		 *  gleichzeitig durch die Methode start() gestartet. */

		SingleMarket.getMarket().start();

		/** Hier werden drei Rohstofflieferanten der Klasse FactoryPattern als Threads erzeugt und
		 *  gleichzeitig durch die Methode start() gestartet. */

		for(int i=1; i<=3; i++) {
			FactoryPattern.getRessourceSupplier().start();
		}

		/** Es werden drei Produzenten der Klasse FactoryPattern als Thread erzeugt
		 *  und gleichzeitig durch die Methode start() gestartet. */

		for(int i=1; i<=3; i++) {
			FactoryPattern.getProducer().start();
		}

		/** Es werden fünf Consumenten der Klasse FactoryPattern als Thread erzeugt
		 *  und gleichzeitig durch die Methode start() gestartet. */

		for(int i=1; i<=5; i++) {
			FactoryPattern.getConsumer().start();
		}
	}
}
