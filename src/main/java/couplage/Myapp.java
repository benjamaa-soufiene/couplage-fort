package couplage;

public class Myapp {

	public static void main(String[] args) {
		Boite b1 =new Boite(4);
		Boite b2 =new Boite(5);
		Moteur m1= new Moteur(b1,60);
		Moteur m2= new Moteur(b2,80);
		Voiture v1= new Voiture("Peugeot 205", m1);
		Voiture v2= new Voiture("Golf 4", m2);
		 System.out.println("La voiture "+v1.getNom()+" possède une puissance de "+v1.getMoteur().getPuissances()+" chevaux et sa consommation est de "+v1.getMoteur().getConsommation()+"%.");
		 System.out.println("La voiture "+v2.getNom()+" possède une puissance de "+v2.getMoteur().getPuissances()+" chevaux et sa consommation est de "+v2.getMoteur().getConsommation()+"%.");
	}

}
