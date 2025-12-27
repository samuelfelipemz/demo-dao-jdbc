package application;

import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Department  obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob Brown", "bob@gmail.com", new java.util.Date(), 3000.0, obj);

        System.out.println(seller);
    }

}
