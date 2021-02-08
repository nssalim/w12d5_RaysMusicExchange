package music_shop;

public class SheetMusic extends StockItem {
    protected String title;
    protected Boolean digitalCopy;

    public SheetMusic(String title, Boolean digitalCopy, int costPrice, int retailPrice) {
        super(title, digitalCopy, costPrice, retailPrice);
        this.title = title;
        this.digitalCopy = digitalCopy;
    }

    public String getTitle() {
        return this.title;
    }

    public Boolean getDigitalCopy() {
        return this.digitalCopy;
    }

    public int getMarkup() {
        return this.retailPrice - this.costPrice;
    }

}
