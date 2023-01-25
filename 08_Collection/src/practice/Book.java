package practice;

import java.util.Objects;

public class Book {
	private String isbn;
	private String title;
	private String author;
	
	public Book(String isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title);
	}
	
	
	
}
