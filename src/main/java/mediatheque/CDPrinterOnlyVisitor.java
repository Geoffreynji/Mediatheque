package mediatheque;

public class CDPrinterOnlyVisitor implements ItemVisitor {

    public void visit(Book book)
    {
        
    }

    public void visit(CD cd)
    {
        //Uniquement Cd car nous sommes dans CdPrinterOnlyVisitor
        cd.print();
    }
    
}
