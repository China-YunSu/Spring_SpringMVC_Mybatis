package man.kuke.dao;

import man.kuke.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/14 - 21:14
 * @description:
 */
public interface BooksMapper {
//    add book
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
