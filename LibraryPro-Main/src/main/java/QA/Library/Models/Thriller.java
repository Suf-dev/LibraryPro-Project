package QA.Library.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Thriller {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String tname;
	private String author;
	@Column(name="Publicationdate")
	private String date;
	private String isbn;
	
	
	public Thriller(int tid, String tname, String author, String date, String isbn) {
		this.tid = tid;
		this.tname = tname;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	
	
	
	public Thriller(String tname, String author, String date, String isbn) {
		this.tname = tname;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	
	

	public Thriller() {
		
	}

	
	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
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
