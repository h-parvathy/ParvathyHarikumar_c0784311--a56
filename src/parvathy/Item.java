package parvathy;

public enum Item
{
    SMALL (2.50),
    LARGE (4.50);
    private final double finalItem;

    Item(double finalItem) {
        this.finalItem = finalItem;
    }

    public double getFinalItem() {
        return this.finalItem;
    }
}

