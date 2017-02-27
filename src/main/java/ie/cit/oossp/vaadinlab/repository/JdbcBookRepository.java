package ie.cit.oossp.vaadinlab.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.cit.oossp.vaadinlab.BookRowMapper;
import ie.cit.oossp.vaadinlab.domain.Book;

@Repository
public class JdbcBookRepository implements BookRepository{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Book> findall() {
		return jdbcTemplate.query("SELECT * FROM books", new BookRowMapper());
	}

	@Override
	public void delete(Book book) {
		jdbcTemplate.update("DELETE FROM books WHERE isbn = ?", book.getIsbn());
	}
}
