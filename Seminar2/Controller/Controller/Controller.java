package Controller;

import Model.Item;
import Repository.Repository;

import java.util.List;

public class Controller {
    private Repository repo;

    public Controller(Repository rep){
        this.repo = rep;
    }

    public List<Item> getItems(){
        return repo.getItems200();
    }
}
