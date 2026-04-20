package models;

public enum Wood {
    INDIAN_ROSEWOOD, MAPLE, ALDER;

    @Override
    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD -> {
                return "Indian Rosewood";
            }
            case MAPLE -> {
                return "Maple";
            }
            case ALDER -> {
                return "Alder";
            }
            default ->
                throw new AssertionError();
        }

    }
}
