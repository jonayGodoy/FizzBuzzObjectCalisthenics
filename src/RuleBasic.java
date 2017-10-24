public class RuleBasic implements Rule{

    private final WrapperNumber number;

    RuleBasic(WrapperNumber number) {
        this.number = number;
    }

    @Override
    public boolean match() {
        return number.getNumber() >0 && number.getNumber()< 100;
    }

    @Override
    public WrapperString generateWrapperString() {
        return WrapperString.convertWrapperString(number);
    }
}
