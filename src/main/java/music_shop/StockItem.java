package music_shop;

import behaviours.ISell;

public abstract class StockItem implements ISell {
    protected int costPrice;
    protected int retailPrice;


    public StockItem(String title, Boolean digitalCopy, int costPrice, int retailPrice) {
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;


    }

    public StockItem(String make, String model, String colour, InstrumentType type, int costPrice, int retailPrice) {
    }


    public int getCostPrice(){
        return this.costPrice;
    }

    public int getRetailPrice(){
        return this.retailPrice;
    }

    public int getMarkup(){
        return this.retailPrice - this.costPrice;
    }
}
