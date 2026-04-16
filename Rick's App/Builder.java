
public enum Builder {
    FENDER, MARTIN;

    @Override
    public String toString() {
        switch (this) {
            case FENDER -> {
                return "Fender";
            }
            case MARTIN -> {
                return "Martin";
            }
            // Add more as needed.
            default ->
                throw new AssertionError();
        }

    }
}
