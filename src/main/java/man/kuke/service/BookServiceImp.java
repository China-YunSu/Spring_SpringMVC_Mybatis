package man.kuke.service;

import man.kuke.dao.BooksMapper;
import man.kuke.pojo.Books;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/14 - 21:34
 * @description:
 */
public class BookServiceImp implements BookService {
    private BooksMapper booksMapper;

    public BooksMapper getBooksMapper() {
        return booksMapper;
    }

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return booksMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryBooks() {
        return booksMapper.queryBooks();
    }
}
