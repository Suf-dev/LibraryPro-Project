package QA.Library.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Biography {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int Bid;
	private String Bname;
	private String author;
	@Column(name="Publicationdate")
	private String date;
	private String isbn;
	
	public Biography() {
		
	}

	

	public int getBid() {
		return Bid;
	}



	public void setBid(int bid) {
		Bid = bid;
	}




	public String getBname() {
		return Bname;
	}



	public void setBname(String bname) {
		Bname = bname;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
