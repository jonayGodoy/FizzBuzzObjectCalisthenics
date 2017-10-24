public class RuleFizzBuzz implements Rule{

    private final WrapperNumber number;

    RuleFizzBuzz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        WrapperBoolean firstCondition = new RuleFizz(number).match();
        WrapperBoolean secondCondition = new RuleBuzz(number).match();

        return WrapperBoolean.and(firstCondition,secondCondition);
    }

    @Override
    public WrapperString generateWrapperString() {
        return new WrapperString("FizzBuzz");
    }
}
