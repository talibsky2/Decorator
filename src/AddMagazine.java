public class AddMagazine extends AddItem{

    public AddMagazine(Shelf item) {
        super(item);
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.print(", magazines");
    }
}
