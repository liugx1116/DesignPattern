package com.atgx.template.improve;

public class PureSoyaMilk extends SoyaMilk {

    @Override
    public boolean customerWantCondiments() {
        return false;
    }

    @Override
    void addCondiments() {

    }
}
