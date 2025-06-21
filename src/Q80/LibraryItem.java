package Q80;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    private boolean isItem;

    public void checkOut( ) {
        if ( isItem ) {
            isItem = false;
        } else {
            System.out.println("Item is checkout");
            isItem = true;
        }
    }

    public void returnItem( ) {
        if( isItem ) {
            System.out.println("Item is already returned");
            isItem = false;
        } else {
            System.out.println("Item is returned");
            isItem = true;
        }
    }
}
