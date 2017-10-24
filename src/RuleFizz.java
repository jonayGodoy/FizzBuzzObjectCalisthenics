public class RuleFizz implements Rule {

    private final WrapperNumber number;

    RuleFizz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        return UtilFizzBuzz.isContainAndModuleOf(number,Factory.generateWNumber(3));
    }

    @Override
    public WrapperString generateWrapperString() {
        return Factory.generateWString("Fizz");
    }
}
