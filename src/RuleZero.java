public class RuleZero implements Rule{

    private final WrapperNumber number;

    public RuleZero(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean isMeet() {
        return number.getNumber() == 0;
    }

    @Override
    public WrapperString generateWrapperString() {
        return WrapperString.empty();
    }
}
