class WrapperFizzBuzz {

    private EngineRules engineRules;

    private WrapperString content;

    WrapperFizzBuzz(WrapperNumber number) {
        engineRules = new EngineRules();
        engineRules.addRule(new RuleZero(number));
        engineRules.addRule(new RuleFizzBuzz(number));
        engineRules.addRule(new RuleFizz(number));
        engineRules.addRule(new RuleBuzz(number));
        engineRules.addRule(new BasicRule(number));

        this.content = generateWrapperString();
    }

    private WrapperString generateWrapperString() {
        return engineRules.executeAll();
    }

    WrapperString getContent() {
        return content;
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
