public class ReferenceBook extends Book implements Loanable{

    
    public ReferenceBook(String title, String author, String publisher, int publishYear, String format, int ISBN){
        super(title, author, publisher, publishYear, format, ISBN);
    }

    @Override
    public boolean isLoanable() {
        return true; 
    }

    
}