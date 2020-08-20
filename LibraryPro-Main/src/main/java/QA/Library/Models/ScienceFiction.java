package QA.Library.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScienceFiction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String author;
	@Column(name="Publicationdate")
	private String date;
	private String isbn;
	
	
	
	
	public ScienceFiction(int sid, String sname, String author, String date, String isbn) {
		this.sid = sid;
		this.sname = sname;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	
	
	
	public ScienceFiction(String sname, String author, String date, String isbn) {
		this.sname = sname;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	
	public ScienceFiction() {
		
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	

	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
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
