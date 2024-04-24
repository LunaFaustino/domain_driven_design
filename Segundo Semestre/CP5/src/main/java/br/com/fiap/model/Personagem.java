package br.com.fiap.model;

public class Personagem {

	private String name;
	private String species;
	private String gender;
	private String house;
	private String dateOfBirth;
	private String wizard;
	private String ancestry;
	private String eyeColour;
	private String hairColour;

	public Personagem() {
		super();
	}

	public Personagem(String name, String species, String gender, String house, String dateOfBirth, String wizard,
			String ancestry, String eyeColour, String hairColour) {
		super();
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.house = house;
		this.dateOfBirth = dateOfBirth;
		this.wizard = wizard;
		this.ancestry = ancestry;
		this.eyeColour = eyeColour;
		this.hairColour = hairColour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getWizard() {
		return wizard;
	}

	public void setWizard(String wizard) {
		this.wizard = wizard;
	}

	public String getAncestry() {
		return ancestry;
	}

	public void setAncestry(String ancestry) {
		this.ancestry = ancestry;
	}

	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	@Override
	public String toString() {
		return "Name= " + name + "\nSpecies= " + species + "\nGender= " + gender + "\nHouse= " + house
				+ "\nDate Of Birth= " + dateOfBirth + "\nWizard= " + wizard + "\nAncestry= " + ancestry + "\nEye Colour= "
				+ eyeColour + "\nHair Colour= " + hairColour;
	}

}
