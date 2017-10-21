public class RuleFizzBuzz implements Rule{

    private final WrapperNumber number;

    RuleFizzBuzz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean isMeet() {
        return new RuleFizz(number).isMeet() && new RuleBuzz(number).isMeet();
    }

    @Override
    public WrapperString generateWrapperString() {
        return new WrapperString("FizzBuzz");
    }
}
