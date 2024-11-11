package flower.store.demo;

public class PaperDecorator extends ItemDecorator{

    private final Item item;

    PaperDecorator(Item item){
        this.item = item;
    }

    public double getPrice(){
        return  13 + item.getPrice();
    }

}