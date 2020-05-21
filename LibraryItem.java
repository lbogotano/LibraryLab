public class LibraryItem {

    //Private variables
    private String title, author, format, publisher;
    private int publishYear, ISBN;
    
    public LibraryItem(String title, String author, String publisher, int publishYear, String format, int ISBN){
        
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.format = format;
        this.ISBN = ISBN;

    }

    //Getters

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getPublishYear(){
        return publishYear;
    }

    public String getFormat(){
        return format;
    }

    public int getISBN(){
        return ISBN;
    }

    //Setters

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setPublishYear(int year){
        this.publishYear = year;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public void setISBN(int isbn){
        this.ISBN = isbn;
    }


    @Override
    public String toString(){
        return "The Title of this "+ getFormat() + " is " + getTitle() + " by " + getAuthor() + " published in " + getPublishYear() + "."; 
    }
}