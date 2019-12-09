public class Pomme extends Acc implements Mangeable {
	private double rayon;
	public Pomme() {
		super("pomme");
		int mmax = 7;
		int mmin = 3;
		rayon = (Math.random() * ((mmax - mmin) + 1)) + mmin;
	}
	public String toString() {
			String s = String.format("%s No %d %.2fkg %.1fcm", getCategorie(), getNumero(), getPoids(), rayon);
			return s;
	}
}
