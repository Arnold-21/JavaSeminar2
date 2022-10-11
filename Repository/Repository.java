package Repository;

import Model.Item;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Item> items = new ArrayList<Item>();

    public void addItem(Item temp){
        this.items.add(temp);
    }

    public List<Item> getItems200(){
        List<Item> tempList = new ArrayList<Item>();
        for (Item e: items){
            if (e.getWeight() > 200){
                tempList.add(e);
            }
        }
        return tempList;
    }

}
