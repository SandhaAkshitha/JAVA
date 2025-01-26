
package dec_09_24;

abstract class Book{
	String title ;
	public Book(String title) {
		super();
		this.title = title;
	}
	
     abstract void setTitle(String title);
     abstract String getTitle() ;
}
class MyBook extends Book {
    public MyBook(String title) {
		super(title);
	}
	
     @Override
	void setTitle(String title) {
		super.title=title;
	}

	@Override
     String getTitle()
     {
    	 return "The title of my book is:"+title;
     }
}
public class BookTaster5{
	public static void Main(String[] args) {
		Book book = null;
		book = new MyBook("A tale of two cities");
		//book.setTitle("A tale of two cities");
		System.out.println(book.getTitle());
	}
}
