package mediatheque;

public class CatalogPrinter implements ItemVisitor{

    //On print les books et cd car nous sommes dans le catalog
    public void visit(Book book)
    {
        book.print();
    }

    public void visit(CD cd)
    {
        cd.print();
    }
}
