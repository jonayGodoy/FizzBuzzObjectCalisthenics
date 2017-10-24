class Factory {

    static WrapperNumber generateNumber(int n){
        return new WrapperNumber(n);
    }

    static WrapperBoolean generateBoolean(boolean state){
        return new WrapperBoolean(state);
    }

}
