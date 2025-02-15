package Feb13;

class OrderProcessor {
    private boolean itemInStock;
    private boolean paymentSuccess;

    public OrderProcessor(boolean itemInStock, boolean paymentSuccess) {
        this.itemInStock = itemInStock;
        this.paymentSuccess = paymentSuccess;
    }

    public void checkItemAvailability() throws Ecommerce.ItemOutOfStockException {
        if (!itemInStock) {
            throw new Ecommerce.ItemOutOfStockException("Item is out of stock.");
        }
    }

    public double calculateTotalCost(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    public void processPayment(double amount) throws Ecommerce.PaymentFailedException {
        if (!paymentSuccess) {
            throw new Ecommerce.PaymentFailedException("Payment processing failed.");
        }
    }

    public void processOrder(int quantity, double pricePerItem) {
        try {
            checkItemAvailability();
            double totalCost = calculateTotalCost(quantity, pricePerItem);
            System.out.println("Total cost: Rs." + totalCost);
            processPayment(totalCost);
            System.out.println("Order processed successfully.");
        } catch (Ecommerce.ItemOutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (Ecommerce.PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }


}
