public class Bookshelf implements Shelf{
    String content;
    public  Bookshelf (String content){
        this.content = content;
    }
    @Override
    public void showContent() {
        System.out.print(content);
    }
}
