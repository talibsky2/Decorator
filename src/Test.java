public class Test {
    public static void main(String[] args) {
        Shelf shelf = new Bookshelf("Shelf with books");
        shelf.showContent();
        System.out.println();
        Shelf shelf1 = new AddMagazine(new Bookshelf("Shelf with books"));
        shelf1.showContent();
        System.out.println();
        Shelf shelf2 = new AddBrochure(new AddMagazine(new Bookshelf("Shelf with books")));
        shelf2.showContent();
    }
}