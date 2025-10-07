import java.util.*;
import java.lang.*;

//Step 1: Base Media class 
abstract class Media {
	protected String title;

	public Media(String title) {
		this.title = title;
	}

	@Override
	// TODO: Override toString() in subclasses
	public String toString() {
		return this.title;
	}
}

//Step 2: Subclasses (Book, Magazine) 
class Book extends Media {
	public Book(String title) {
		super(title);
	}

	@Override
	// TODO: Override toString() in subclasses
	public String toString() {
		return title;
	}
}

class Magazine extends Media {
	public Magazine(String title) {

		super(title);
	}

	@Override
	// TODO: Override toString() in subclasses
	public String toString() {
		return title;
	}
}

//Step 3: Generic Shelf class 
class Shelf<T extends Media> {
	// TODO: Store list of items

	// TODO: Method to add an item
	// TODO: Method to get an item
	// TODO: Method to print all items
}

//Step 4: Utility methods using generics 
class LibraryUtils {
	// TODO: Generic method to display info of any Shelf<?>
	// e.g. displayMediaInfo(Shelf<T> shelf)

	// TODO: Wildcard method to copy Shelf<? extends Media> to Shelf<? super Media>
	// e.g. copyShelf(source, destination)
}

//Step 5: Main method to test 
public class LibraryManagement {
	public static void main(String[] args) {
		// TODO: Create Shelf<Book>
		// TODO: Add books
		// TODO: Create Shelf<Magazine>
		// TODO: Add magazines
		// TODO: Print items
		// TODO: Display media info
		// TODO: Copy to a mixed media shelf
	}
}