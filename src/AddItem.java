abstract class AddItem implements Shelf {
    Shelf item;
    public  AddItem (Shelf item){
        this.item = item;
    }

    @Override
    public void showContent() {
        item.showContent();
    }
}
