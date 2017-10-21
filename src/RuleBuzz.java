public class RuleBuzz implements Rule{
    private final WrapperNumber number;

    public RuleBuzz(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean isMeet() {
        return number.getNumber() % 5 == 0;
    }

    @Override
    public WrapperString generateWrapperString() {
        return new WrapperString("Buzz");
    }

}
