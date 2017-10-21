import java.util.ArrayList;
import java.util.List;

class WrapperFizzBuzz {

    private List<Rule> rules;

    public WrapperString getContent() {
        return content;
    }

    private WrapperString content;

    WrapperFizzBuzz(WrapperNumber number) {
        rules = new ArrayList<>();
        rules.add(new IsZeroRule(number));
        this.content = generateWrapperString(number);
    }

    private WrapperString generateWrapperString(WrapperNumber number) {
        for (Rule rule : rules) {
            return EngineRules.execute(rule);
        }

        return WrapperString.convertWrapperString(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperFizzBuzz that = (WrapperFizzBuzz) o;

        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }
}
