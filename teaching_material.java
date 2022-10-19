package experiment3_10_13;

public class teaching_material {
    private String bookname;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public teaching_material(String bookname) {
        this.bookname = bookname;
    }

    public teaching_material() {

    }

    @Override
    public String toString() {
        return "teaching_material{" +
                "bookname='" + bookname + '\'' +
                '}';
    }
}
