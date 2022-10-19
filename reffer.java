package experiment3_10_13;

import java.util.Arrays;

public class reffer {
    teaching_material book[] = new teaching_material[1000];
    course co;

    public teaching_material[] getBook() {
        return book;
    }

    public void setBook(teaching_material[] book) {
        this.book = book;
    }

    public course getCo() {
        return co;
    }

    public void setCo(course co) {
        this.co = co;
    }

    public reffer(teaching_material[] book, course co) {
        this.book = book;
        this.co = co;
    }
    public reffer() {
    }

    @Override
    public String toString() {
        return "reffer{" +co.getCoursename()+"'s "+
                "book=" + Arrays.toString(book) +
                '}';
    }

}
