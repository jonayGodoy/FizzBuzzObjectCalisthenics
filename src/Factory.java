class Factory {

    static WrapperBoolean generateWBoolean(boolean state){return new WrapperBoolean(state);}

    static WrapperNumber generateWNumber(int n){
        return new WrapperNumber(n);
    }

    static WrapperString generateWString(String string){return new WrapperString(string);}

}
