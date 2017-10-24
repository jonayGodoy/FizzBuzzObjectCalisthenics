import java.util.Map;

class IteratorListRule{

    private Map<WrapperNumber, Rule> ruleList;
    private WrapperBoolean isNext;
    private WrapperNumber positionCurrentRule;

    IteratorListRule(Map<WrapperNumber, Rule> ruleList) {
        this.positionCurrentRule = new WrapperNumber(0);

        isNext = WrapperBoolean.True();
        this.ruleList = ruleList;
    }

    Rule nextRule(){
        Rule currentRule = ruleList.get(positionCurrentRule);
        isNext = WrapperBoolean.not(currentRule.match());
        positionCurrentRule.increment();

        return currentRule;
    }

    WrapperBoolean hasNextRule(){
        return  WrapperBoolean.and(isNext,WrapperBoolean.not(isEndList()));
    }

    private WrapperBoolean isEndList() {
        return WrapperNumber.isGreaterThan(positionCurrentRule, new WrapperNumber(ruleList.size()-1));
    }
}
