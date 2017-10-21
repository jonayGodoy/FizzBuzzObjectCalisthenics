import java.util.ArrayList;
import java.util.List;

class EngineRules {

    private final Rule defaultRule;
    private List<Rule> rules ;

    public EngineRules(Rule defaultRule) {
        this.defaultRule = defaultRule;
        rules = new ArrayList<>();
    }

    public void addRule(Rule rule){
        rules.add(rule);
    }

    public WrapperString executeAll(){
        for (Rule rule : rules) {
            if(rule.isMeet()){return rule.generateWrapperString();}}

        if(defaultRule.isMeet()){return defaultRule.generateWrapperString();}

        return WrapperString.empty();
    }

}
