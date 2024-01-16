package models.products;

public class General extends Product {

    public General(String productName, double unitPrice, int currentStockQuantity, int targetMaxStockQuantity, int targetMinStockQuantity, int restockSchedule, int discountStrategyId, String productType) {
        super(productName, unitPrice, currentStockQuantity, targetMaxStockQuantity, targetMinStockQuantity, restockSchedule, discountStrategyId, productType);
    }

    /**
     * @returns product state
     */

    public String getProductState() {
        return this.getProductState();
    }
}
