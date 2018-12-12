package Entity;

public class Book 
{
	
	private String bookId;
	private String bookName;
	private String authorName;
	private int price;
	private int quantity;
	
	public String getBookId(String i) {
		//System.out.print(i);
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName(String string) {
		//System.out.println(string);
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName(String string) {
		//System.out.println(string);
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPrice(int i) {
		//System.out.println(i);
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity(int i) {
		//System.out.println(i);
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
