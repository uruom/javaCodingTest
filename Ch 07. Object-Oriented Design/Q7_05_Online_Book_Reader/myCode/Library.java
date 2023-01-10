package Q7_05_Online_Book_Reader.myCode;

import java.util.ArrayList;

/**
 * @ClassName:Library
 * @Auther: uruom
 * @Description: reposity of book
 * @Date: 2023/1/10 10:39
 * @Version: v1.0
 */
public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public Book getBook(int booknum){
        for(Book book:books){
            if (book.getBooknum()==booknum) {
                return book;
            }
        }
        return null;
    }
}
