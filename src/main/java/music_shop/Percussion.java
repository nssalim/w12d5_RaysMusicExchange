package music_shop;

public class Percussion extends Instrument {

    protected String make;
    protected String model;
    protected String colour;
    protected int numberOfPieces;

    public Percussion(String make, String model, String colour, int numberOfPieces, int costPrice, int retailPrice) {
        super(make, model, colour, InstrumentType.PERCUSSION, costPrice, retailPrice);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.numberOfPieces = numberOfPieces;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }

    public String play() {
        return "Fade Away by Buddy Holly";
    }

    public int getMarkup() {
        return this.retailPrice - this.costPrice;
    }

}
