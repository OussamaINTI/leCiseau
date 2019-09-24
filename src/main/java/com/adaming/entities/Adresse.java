package com.adaming.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private String rue;
	private String codePostal;

	public Adresse() {
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

}
