package com.navin.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library")
public class Books {
	@Id
	@Column(name="bid")
	private int bid;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	public Books() {
		// TODO Auto-generated constructor stub
	}
	public Books(int bid, String title, String author) {
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", title=" + title + ", author=" + author + "]";
	}
	

}
