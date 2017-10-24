public class RuleBuzz implements Rule{
    private final WrapperNumber number;

    RuleBuzz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        WrapperBoolean firstCondition = WrapperNumber.isModuleOf(number, Factory.generateWNumber(5));
        WrapperString numberString = WrapperString.convertWrapperString(number);
        WrapperBoolean secondCondition = WrapperString.contains(numberString, Factory.generateWString("5"));

        return WrapperBoolean.or(firstCondition,secondCondition);
    }

    @Override
    public WrapperString generateWrapperString() {
        return Factory.generateWString("Buzz");
    }

}
