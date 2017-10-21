public class BasicRule implements Rule{

    private final WrapperNumber number;

    BasicRule(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean isMeet() {
        return number.getNumber() >0 && number.getNumber()< 100;
    }

    @Override
    public WrapperString generateWrapperString() {
        return WrapperString.convertWrapperString(number);
    }
}
