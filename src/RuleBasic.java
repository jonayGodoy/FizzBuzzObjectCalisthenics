public class RuleBasic implements Rule{

    private final WrapperNumber number;

    RuleBasic(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        WrapperBoolean firstCondition = WrapperNumber.isGreaterThan(number, new WrapperNumber(0));
        WrapperBoolean secondCondition = WrapperNumber.isGreaterThan(number, new WrapperNumber(100));

        return WrapperBoolean.and(firstCondition,secondCondition);
    }

    @Override
    public WrapperString generateWrapperString() {
        return WrapperString.convertWrapperString(number);
    }
}
