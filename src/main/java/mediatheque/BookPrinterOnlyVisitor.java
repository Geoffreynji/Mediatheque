package mediatheque;

public class BookPrinterOnlyVisitor implements ItemVisitor {
    
    public void visit(Book book)
    {
        //Uniquement book car nous sommes dans bookprinteronlyvisitor
        book.print();
    }

    public void visit(CD cd)
    {

    }
    
}
