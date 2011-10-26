package ch.hszt.hs_2011.aud.exercise_05;

import java.util.Arrays;
import java.util.Date;

/*
 * Implementierungsansatz:
 * equals:
 * Ich vergleiche die ISBN Nummer, da diese jedes Buch eindeutig identifiziert.
 * 
 * hashCode:
 * Ich verwende den Vorschlag aus dem Unterricht und lasse alle Daten einfliessen.
 * 
 * toString:
 * Ich gebe alle relevanten Daten aus.
 * 
 * compareTo:
 * Ich vergleiche die Bücher nach Titel
 */

public class Task2Impl_Schmid extends Task2 {

	public Task2Impl_Schmid(Author[] authors, String title, String isbn,
			String publisher, Date dateOfPublication, double price)
			throws NullPointerException {
		super(authors, title, isbn, publisher, dateOfPublication, price);
	}

	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Task2)){
			return false;
		}else{
			return 	this.getIsbn().equals(((Task2)object).getIsbn());
		}
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + Arrays.hashCode(this.getAuthors());
		result = 37 * result + this.getDateOfPublication().hashCode();
		result = 37 * result + this.getIsbn().hashCode();
		result = 37 * result + (int) this.getPrice();
		result = 37 * result + this.getPublisher().hashCode();
		result = 37 * result + this.getTitle().hashCode();
		return result;
	}

	@Override
	public String toString() {
		String resultString = "";
		String authorString = "";
		
		for(Task2.Author a : this.getAuthors()){
			authorString += a.getFirstName() + " " + a.getLastName() + ";";
		}
		authorString = authorString.substring(0, authorString.length()-1);
		
		resultString += "Authors: " + authorString + "\n";
		resultString += "Date of Publication: " + this.getDateOfPublication().toString() + "\n";
		resultString += "ISBN: " + this.getIsbn() + "\n";
		resultString += "Price: " + this.getPrice() + "\n";
		resultString += "Publisher: " + this.getPublisher() + "\n";
		resultString += "Title: " + this.getTitle();
		
		// TODO Auto-generated method stub
		return resultString;
	}

	@Override
	public int compareTo(Task2 task4Book) {
		return task4Book.getTitle().compareTo(this.getTitle());
	}

}
