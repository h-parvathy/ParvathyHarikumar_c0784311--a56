package parvathy;

public enum Option
{
    SMALL (8.00),
    LARGE (20.11);
    private final double finalOption;

    Option(double finalOption) {
        this.finalOption = finalOption;
    }

    public double getFinalOption() {
        return this.finalOption;
    }
}
