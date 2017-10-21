class WrapperNumber{

    private int number;

    WrapperNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public boolean isZero() {
        return number == 0;
    }
}
