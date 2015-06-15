package generated;

public class Our {

	private String name;
	private int poids;
	private String couleur;
	
	public Our() {}

	public Our(String name, int poids, String couleur) {
		this.name = name;
		this.poids = poids;
		this.couleur = couleur;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public String toString() {
		return this.name;
	}
}