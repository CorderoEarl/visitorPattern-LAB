public interface ShippingCost {
    double computeShippingCost(Chair chair, double distance);
    double computeShippingCost(Sofa sofa, double distance);
    double computeShippingCost(Table table, double distance);
}
