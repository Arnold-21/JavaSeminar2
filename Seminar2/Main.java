import Controller.Controller;
import Model.Apple;
import Model.Book;
import Model.Cake;
import Model.Item;
import Repository.Repository;
import View.View;

import java.util.List;

public class Main {
    public static <Apple> void main(String[] args) {
        Repository repo = new Repository();
        Book b = new Book();
        b.setWeight(100);
        Cake c = new Cake();
        c.setWeight(3000);
        Model.Apple a = new Model.Apple();
        a.setWeight(250);
        repo.addItem(b);
        repo.addItem(c);
        repo.addItem(a);
        Controller cont = new Controller(repo);
        View view = new View(cont);

        view.printItems();
    }
}