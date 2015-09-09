package iterator;

import java.util.Iterator;

public class BookSelfIterator implements Iterator<Object> {
	private BookShelf bookShelf;
	private int index;
	
	public BookSelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
