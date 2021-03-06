package parvathy;

public enum Service
{
    A (100),
    B (150);
    private final int finalService;

    Service(int finalService) {
        this.finalService = finalService;
    }

    public double getFinalService() {
        return this.finalService;
    }
}
