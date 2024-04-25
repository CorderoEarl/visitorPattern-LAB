public interface Furniture {
    double accept(ShippingCost visitor, double distance);
}
