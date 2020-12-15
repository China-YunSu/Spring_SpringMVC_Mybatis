package man.kuke.controller;

import man.kuke.pojo.Books;
import man.kuke.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/15 - 20:55
 * @description:
 */
@Controller
public class BookController {
    @Autowired
    @Qualifier("BookServiceImp")
    private BookService bookService;


    public BookController() {
    }

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryBooks();
        model.addAttribute("list",books);
        return "allBook";
    }

}
