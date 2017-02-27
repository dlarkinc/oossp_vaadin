package ie.cit.oossp.vaadinlab.repository;

import java.util.List;

import ie.cit.oossp.vaadinlab.domain.Book;

public interface BookRepository {
	List<Book> findall();
	void delete(Book book);
}
