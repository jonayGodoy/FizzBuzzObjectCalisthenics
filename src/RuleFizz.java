public class RuleFizz implements Rule {

    private final WrapperNumber number;

    public RuleFizz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean match() {
        return number.getNumber() % 3 == 0;
    }

    @Override
    public WrapperString generateWrapperString() {
        return new WrapperString("Fizz");
    }
}
