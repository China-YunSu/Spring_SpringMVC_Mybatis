package man.kuke.service;

import man.kuke.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/14 - 21:33
 * @description:
 */
public interface BookService {
    int addBook(Books book);
    //    delete book
    int deleteBook(@Param("bookId") int id);

    //  update book
    int updateBook(Books books);

    //    querybook
    Books queryBookById(int id);

    //    querybooks
    List<Books> queryBooks();
}
