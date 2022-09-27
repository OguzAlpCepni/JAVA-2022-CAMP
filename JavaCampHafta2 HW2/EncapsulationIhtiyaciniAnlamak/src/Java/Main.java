package Java;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("laptop");
        System.out.println(product.getName());
        product.setDescription("asus leptop");
        System.out.println(product.getDescription());


        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }
}
