package exception;

public class CircleWithException {
    double r;

    public CircleWithException(double r) {
        if (r > 0) {
            this.r = r;
            addcount();
        }
        else if (r == 0) {
            this.r = r;
        }
        else if (r < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public static int getNumberOfObjects() {
        return count;
    }

    static int count = 0;
    private void addcount()
    {
        count++;
    }

}