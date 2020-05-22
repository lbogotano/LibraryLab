public class Magazine extends Periodical implements Readable{
    
    private String category;
    private String audience;
 
     public Magazine(String title, String author, String publisher, int publishYear, String format, int ISBN, String category, String audience){
         super(title, author, publisher, publishYear, format, ISBN);
         this.category = category;
         this.audience = audience;
         
     }
 
     //getters
     public String getCategory(){
         return category;
     }
 
     public String getAudience(){
         return audience;
     }
     
     //setters
 
     public void setCategory(String category){
         this.category = category;
     }
 
     public void setAudience(String audience){
         this.audience = audience;
     }
 }