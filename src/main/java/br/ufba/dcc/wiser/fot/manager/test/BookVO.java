package br.ufba.dcc.wiser.fot.manager.test;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Book")
public class BookVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long bookId;
	private String bookName;
	private String author;
	
	public BookVO () {
		
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
