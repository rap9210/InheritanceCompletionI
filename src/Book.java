public class Book extends Product{
    private String author;
    private int pages;

    @Override
    public boolean equals(Object obj) {
        System.out.println("I modified equals() for the Book subclass");
        return !super.equals(obj);
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
