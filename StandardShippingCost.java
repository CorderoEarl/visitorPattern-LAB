public class StandardShippingCost implements ShippingCost {
    public double computeShippingCost(Chair chair, double distance) {

        return 15.0;
    }

    public double computeShippingCost(Sofa sofa, double distance) {

        return distance * 2.0;
    }

    public double computeShippingCost(Table table, double distance) {
        
        return 25.0 + distance * 1.5;
    }
}
