public class RuleFizzBuzz implements Rule{

    private final WrapperNumber number;

    RuleFizzBuzz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean match() {
        return new RuleFizz(number).match() && new RuleBuzz(number).match();
    }

    @Override
    public WrapperString generateWrapperString() {
        return new WrapperString("FizzBuzz");
    }
}
