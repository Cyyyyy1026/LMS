package Book;

public class Book{
    private  int id;//书籍编号
    private  String name;//书名
    private  String author;//作者
    private  int qty;//数量

    public Book(int id, String name, String author, int qty) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return  "书籍号：" + id +
                ",书名：" + name +
                ",作者：" + author +
                ",库存：" + qty;
    }
}