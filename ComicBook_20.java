package edu.smg03;

public class ComicBook_20 extends Book_20 {
	private String characterName;
	public ComicBook_20(double regularPrice, String publisher, int yearPublished, String characterName) {
		super(regularPrice, publisher, yearPublished);
		this.setCharacterName(characterName);
	}
	
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.4;
    }

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
}
