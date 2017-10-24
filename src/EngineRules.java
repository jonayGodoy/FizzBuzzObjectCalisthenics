import java.util.HashMap;
import java.util.Map;

class EngineRules {

    private Map<WrapperNumber, Rule> rules ;

    EngineRules() {
        rules = new HashMap<>();
    }

    void addRule(Rule rule){
        rules.put(Factory.generateWNumber(rules.size()),rule);
    }

    WrapperString executeAll(){
        WrapperString result = WrapperString.empty();

        IteratorListRule iteratorListRule = new IteratorListRule(rules);
        while(iteratorListRule.hasNextRule().equals(WrapperBoolean.True())){
           Rule rule = iteratorListRule.nextRule();
           result = rule.generateWrapperString();
        }

        return result;
    }

}
