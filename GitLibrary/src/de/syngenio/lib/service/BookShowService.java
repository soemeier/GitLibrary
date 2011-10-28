package de.syngenio.lib.service;

import java.util.Collection;

import de.syngenio.lib.dao.BookDao;
import de.syngenio.lib.domainobject.Book;
import de.syngenio.lib.io.CharacterReader;

public class BookShowService implements IMenuChoiceService{


	private BookDao bookDao;
	
	@Override
	public void optionSelected() {
		Collection<Book> booksFound = bookDao.findAllBooks();
		System.out.println("Folgende B�cher sind registriert:");
		for (Book book : booksFound) {
			System.out.println("ID: " + book.getId() +  ", Name: " +book.getName());
		}
		CharacterReader.readString("Bitte dr�cken sie irgendeine Taste f�r weiter");
	}
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}


	
}
