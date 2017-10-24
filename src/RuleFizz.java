public class RuleFizz implements Rule {

    private final WrapperNumber number;

    RuleFizz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public WrapperBoolean match() {
        return WrapperNumber.isModuleOf(number, Factory.generateNumber(3));
    }

    @Override
    public WrapperString generateWrapperString() {
        return new WrapperString("Fizz");
    }
}
