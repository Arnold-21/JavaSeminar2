package Controller;

import Model.Item;
import Repository.Repository;

import java.util.List;

public class Controller {
    private Repository repo;

    public Controller(Repository rep){
        this.repo = rep;
    }

    public void printItems(){
        List<Item> items = repo.getItems200();
        for (Item e:items){
            System.out.println(e.getName());
        }
    }
}
