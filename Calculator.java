public abstract class Calculator implements Multiplier, Divider {
    protected static int total;

    public Calculator(){
        total = 1;
    }


    public void multiply(int y) {
        total = total * y;
    }


    public void divide(int y) {
        total = total / y;
    }

    public abstract int calculate();
}
