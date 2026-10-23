package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because it inherits the properties and behaviors of Product
// Line 2: name one other class a shop system might have that would NOT pass this test, and say why
//Shopping cart - It doesn’t represent an item being sold; instead, it’s a container or collection that holds multiple products.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}