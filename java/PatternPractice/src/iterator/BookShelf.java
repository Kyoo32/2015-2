package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Aggregate{
	//private Book[] books;
	private ArrayList<Book> books = new ArrayList<Book>();
	private int last = 0;
	
	/*
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	*/
	
	public Book getBookAt(int index){
		//return books[index];
		return books.get(index);
	}
	public void appendBook(Book book){
		//this.books[last] = book;
		books.add(book);
		last++;
	}
	public int getLength() {
		return last;
	}
	@Override
	public Iterator<Object> iterator() {
		return new BookSelfIterator(this);
	}
}
