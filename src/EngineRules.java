class EngineRules {
    static WrapperString execute(Rule rule){
        if(rule.isMeet()){
            return rule.generateWrapperString();
        }
        return WrapperString.empty();
    }
}
