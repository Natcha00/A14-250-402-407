
public class Cook{
    String Title;
    public Cook(){
        Title="";
    }
    public Cook(String bookTitle){
        Title = bookTitle;
    }
    public void setTitle(String bookTitle){
        Title = bookTitle;
    }
    public String toString(){
        return "MENU"+Title;
    }
}
