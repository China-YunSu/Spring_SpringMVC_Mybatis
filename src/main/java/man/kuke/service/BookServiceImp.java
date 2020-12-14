package man.kuke.service;

import man.kuke.dao.BookMapper;
import man.kuke.pojo.Books;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/14 - 21:34
 * @description:
 */
public class BookServiceImp implements BookService {
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryBooks() {
        return bookMapper.queryBooks();
    }
}
