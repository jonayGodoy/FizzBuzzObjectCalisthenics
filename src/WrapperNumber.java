class WrapperNumber{

    private int number;

    WrapperNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    private int getNumber() {
        return number;
    }

    void increment(){

        System.out.println(number);
        number = number +1;
    }

    static WrapperBoolean isGreaterThan(WrapperNumber less, WrapperNumber higher){
        return new WrapperBoolean(less.getNumber() > higher.getNumber());
    }

    static WrapperBoolean isModuleOf(WrapperNumber number, WrapperNumber module){
        return new WrapperBoolean(number.getNumber() % module.getNumber() == 0);
    }

    static WrapperBoolean is(WrapperNumber number, WrapperNumber module){
        return new WrapperBoolean(number.getNumber() == module.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperNumber that = (WrapperNumber) o;

        return number == that.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
