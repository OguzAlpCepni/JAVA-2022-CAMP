package Java;

public class Product {
        private int id;
        private String name;
        private String description;
        private double price;

        public int getId() {
            return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmound() {
        return stockAmound;
    }

    public void setStockAmound(int stockAmound) {
        this.stockAmound = stockAmound;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    private int stockAmound;
    private String kod;
}
