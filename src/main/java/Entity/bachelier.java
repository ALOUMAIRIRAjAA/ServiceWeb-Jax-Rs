package Entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class bachelier {
	
	private Integer id;
	private String nom;
	private String prenom;
	private String cin;
	private String N_etudiant;
	private int concours;
	private float arab;
	private float math;
	private float pc;
	private float eng;
	
	public bachelier(Integer id, String nom, String prenom, String cin, String n_etudiant, int concours, float arab,
			float math, float pc, float eng) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		N_etudiant = n_etudiant;
		this.concours = concours;
		this.arab = arab;
		this.math = math;
		this.pc = pc;
		this.eng = eng;
	}

	public bachelier() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getN_etudiant() {
		return N_etudiant;
	}

	public void setN_etudiant(String n_etudiant) {
		N_etudiant = n_etudiant;
	}

	public int getConcours() {
		return concours;
	}

	public void setConcours(int concours) {
		this.concours = concours;
	}

	public float getArab() {
		return arab;
	}

	public void setArab(float arab) {
		this.arab = arab;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getPc() {
		return pc;
	}

	public void setPc(float pc) {
		this.pc = pc;
	}

	public float getEng() {
		return eng;
	}

	public void setEng(float eng) {
		this.eng = eng;
	}
	

	@Override
	public String toString() {
		return "bachelier [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", N_etudiant="
				+ N_etudiant + ", concours=" + concours + ", arab=" + arab + ", math=" + math + ", pc=" + pc + ", eng="
				+ eng + "]";
	}

	
	
	
	
	
	
	
	
	
	

}
