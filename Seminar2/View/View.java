package View;

import Controller.Controller;
import Model.Item;

import java.util.List;

public class View {
    private Controller cont;
    public View(Controller cont){
        this.cont = cont;
    }

    public void printItems(){
        List<Item> items = this.cont.getItems();
        for (Item e: items){
            System.out.println(e.getName());
        }
    }
}
