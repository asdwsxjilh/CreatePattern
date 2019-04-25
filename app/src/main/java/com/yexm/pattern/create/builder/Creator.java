package com.yexm.pattern.create.builder;

/**
 * 建造者模式
 */
public class Creator {

    private char paramA;

    private int paramB;

    private String paramC;

    private Creator() {}

    public class Builder {

        private Creator creator;

        public Builder(){
            creator = new Creator();
        }

        public Builder setParamA(char a){
            creator.paramA = a;
            return this;
        }

        public Builder setParamB(int b){
            creator.paramB = b;
            return this;
        }

        public Builder setParamC(String c){
            creator.paramC = c;
            return this;
        }

        public Creator build() {
            return creator;
        }
    }
}