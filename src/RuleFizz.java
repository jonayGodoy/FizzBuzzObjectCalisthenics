public class RuleFizz implements Rule {

    private final WrapperNumber number;

    RuleFizz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        WrapperBoolean firstCondition = WrapperNumber.isModuleOf(number, Factory.generateWNumber(3));
        WrapperString numberString = WrapperString.convertWrapperString(number);
        WrapperBoolean secondCondition = WrapperString.contains(numberString, Factory.generateWString("3"));

        return WrapperBoolean.or(firstCondition,secondCondition);
    }

    @Override
    public WrapperString generateWrapperString() {
        return Factory.generateWString("Fizz");
    }
}
