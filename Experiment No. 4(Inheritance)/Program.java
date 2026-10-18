
class Product {
    int product_id;
    String name;

    Product(int product_id, String name) {
        this.product_id = product_id;
        this.name = name;
    }

    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + name);
    }
}

class Electronic extends Product {
    String brand;

    Electronic(int product_id, String name, String brand) {
        super(product_id, name);
        this.brand = brand;
    }

    void displayElectronics() {
        display();
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    String size;

    Clothing(int product_id, String name, String size) {
        super(product_id, name);
        this.size = size;
    }

    void displayClothing() {
        display();
        System.out.println("Size: " + size);
    }
}

public class pratical_4 {
    public static void main(String args[]) {
        Electronic e = new Electronic(101, "Laptop", "HP");
        Clothing c = new Clothing(102, "T-shirt", "Large");

        System.out.println("Electronics Details");
        e.displayElectronics();

        System.out.println();

        System.out.println("Clothing Details");
        c.displayClothing();
    }
}
