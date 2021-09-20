/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Zachary Harris)
 * @version (9/20/21)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
    }

    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void printAuthor(){
        System.out.println("Author: " + author);
    }
    
    public void printTitle(){
        System.out.println("Title: " + title);
    }
    
    public int getPages(){
        return pages;
    }
    
    public void printDetails(){
        System.out.println("Title: " + title + ", Author: " + author +
        ", Pages: " + pages);
        
        if (refNumber.length() <=0){
            System.out.println("ZZZ");
        } else{
            System.out.println("Reference Number: " + refNumber);
        }
    }
    
    public void setRefNumber(String ref){
        if (refNumber.length() <= 2){
            refNumber = "";
            System.out.println("Invalid Reference Number");
        } else {
            refNumber = ref;
        }
    }
    
    public String getRefNumber(){
        return refNumber;
    }
}
