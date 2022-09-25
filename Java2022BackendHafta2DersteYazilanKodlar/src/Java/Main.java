package Java;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        String mesaj = "Vade Orani";
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDisCount(7);
        product1.setImageUrl("bilmem ne ");
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);

        Product product2 = new Product();
        product2.setName("Sweg");
        product2.setDisCount(7);
        product2.setImageUrl("bilmem ne ");
        product2.setUnitPrice(7500);
        product2.setUnitInStock(3);

        Product product3 = new Product();
        product3.setName("kitchen aid");
        product3.setDisCount(9);
        product3.setImageUrl("bilmem ne ");
        product3.setUnitPrice(4500);
        product3.setUnitInStock(4);

        Product[] products = {product1,product2,product3};

        for(Product product : products){
            System.out.println(product.getName());
        }



        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setFirstName("engin");
        individualCustomer.setLastName("Demirog");
        individualCustomer.setId(1);
        individualCustomer.setPhone("1232131");
        individualCustomer.setCustomerNumber("2131");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setTaxNumber("2121");
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("22132131");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customer = {individualCustomer,corporateCustomer};
    }



}
