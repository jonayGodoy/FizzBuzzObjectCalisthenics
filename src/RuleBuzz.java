public class RuleBuzz implements Rule{
    private final WrapperNumber number;

    RuleBuzz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        return UtilFizzBuzz.isContainAndModuleOf(number,Factory.generateWNumber(5));
    }

    @Override
    public WrapperString generateWrapperString() {
        return Factory.generateWString("Buzz");
    }

}
