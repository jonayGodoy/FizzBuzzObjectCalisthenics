public class IsZeroRule implements Rule{

    private final WrapperNumber number;

    IsZeroRule(WrapperNumber number) {
      this.number = number;
    }

    @Override
    public boolean isMeet() {
        return number.getNumber() == 0;
    }

    @Override
    public WrapperString generateWrapperString() {
        return WrapperString.empty();
    }
}
