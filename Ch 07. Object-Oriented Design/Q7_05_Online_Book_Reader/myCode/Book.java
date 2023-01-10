package Q7_05_Online_Book_Reader.myCode;

import java.util.ArrayList;

/**
 * @ClassName:Bool
 * @Auther: uruom
 * @Description: theClassOfAllKindOfBook
 * @Date: 2023/1/10 09:24
 * @Version: v1.0
 */
public class Book {
    public BookKind bookKind;
    public int booknum;
    public ArrayList<BookMark> bookMarks  = new ArrayList<>();
    public ArrayList<Catalogue> catalogues = new ArrayList<>();

    public int getBooknum() {
        return booknum;
    }
}
