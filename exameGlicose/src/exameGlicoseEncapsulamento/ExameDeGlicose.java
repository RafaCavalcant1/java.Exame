package exameGlicoseEncapsulamento;

public class ExameDeGlicose {
	private int idExame;
	private String nomePaciente;
	private int nivelGlicose;
	
	public ExameDeGlicose(int idExame,String nomePaciente,int nivelGlicose){
		this.idExame = idExame;
		this.nomePaciente = nomePaciente;
		this.nivelGlicose = nivelGlicose;
	}
	
	public int getIdExame() {
		return idExame;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getNivelGlicose() {
		return nivelGlicose;
	}

	public void setNivelGlicose(int nivelGlicose) {
		this.nivelGlicose = nivelGlicose;
	}

	
	
	public String obterDiagnostico() {
		if(getNivelGlicose()<=99) {
			return "Normal";
		}
		else if(getNivelGlicose()>= 100 && getNivelGlicose()<= 125) {
			return "Pre-Diabetes";
		}
		else {
			return "Diabetes";
		}
	}
}
