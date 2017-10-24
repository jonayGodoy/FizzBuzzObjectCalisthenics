public abstract class UtilFizzBuzz {

    static WrapperBoolean isContainAndModuleOf(WrapperNumber number, WrapperNumber module) {
        WrapperBoolean firstCondition = WrapperNumber.isModuleOf(number, module);
        WrapperString numberString = WrapperString.convertWrapperString(number);
        WrapperString moduleString = WrapperString.convertWrapperString(module);
        WrapperBoolean secondCondition = WrapperString.contains(numberString, moduleString);

        return WrapperBoolean.or(firstCondition,secondCondition);
    }
}
