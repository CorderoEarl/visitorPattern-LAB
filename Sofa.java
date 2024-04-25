public class Sofa implements Furniture {
    public double accept(ShippingCost visitor, double distance) {
        return visitor.computeShippingCost(this, distance);
    }
}