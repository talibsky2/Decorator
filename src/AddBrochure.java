public class AddBrochure extends AddItem{

    public AddBrochure(Shelf item) {
        super(item);
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.print(" and brochures");
    }
}
