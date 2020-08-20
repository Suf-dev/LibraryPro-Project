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
	private int bid;
	private String bname;
	private String author;
	@Column(name="Publicationdate")
	private String date;
	private String isbn;
	

	
	public Biography(String bname, String author, String date, String isbn) {
		this.bname = bname;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	public Biography(int bid, String bname, String author, String date, String isbn) {
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	
	
	public Biography() {
		
	}

	

	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}




	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
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
