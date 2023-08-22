import classes.Food;
import classes.Stock;
import classes.Technology;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addObserver(new Technology());
        stock.addObserver(new Food());

        stock.setInStock(true);        

        stock.removeObserver(new Technology());
        stock.setInStock(false);
    }
}
