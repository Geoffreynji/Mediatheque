package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	private final ItemVisitor v= new CatalogPrinter();
	private final ItemVisitor CD= new CDPrinterOnlyVisitor();
	private final ItemVisitor Book= new BookPrinterOnlyVisitor();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
		//On implemente la méthode accept
		i.accept(v);
	}
	
	public void printOnlyBooks() {
		//On implemente la méthode accept
		for (Item i : items){
			i.accept(Book);
		}
	}

	public void printOnlyCDs() {
		//On implemente la méthode accept
		for (Item i : items){
			i.accept(CD);
		}
	}

}
