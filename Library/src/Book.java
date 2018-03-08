public class Book {
	private String title;
	private String author;
	private Integer releaseYear;
	private int price;
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
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString(){
		return "Book (title=" + title + ", author=" + author + ", releaseYear=" + releaseYear + ", price=" + price + ")";
	}
}
