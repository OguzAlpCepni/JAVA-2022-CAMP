package Java;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.name="laptop";
        System.out.println(product.name);
        product.description ="asus leptop";
        System.out.println(product.description);


        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
