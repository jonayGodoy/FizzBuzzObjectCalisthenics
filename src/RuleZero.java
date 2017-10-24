public class RuleZero implements Rule{

    private final WrapperNumber number;

    RuleZero(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        return WrapperNumber.is(number,new WrapperNumber(0));
    }

    @Override
    public WrapperString generateWrapperString() {
        return WrapperString.empty();
    }
}
