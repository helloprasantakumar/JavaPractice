package com.design_pattern.singleton;

public class SingleTonExample {

    private static SingleTonExample singleTonExample;
    private  SingleTonExample(){

    }

    public static SingleTonExample getSingleTonExampleInstance(){
        if(singleTonExample == null){
            singleTonExample = new SingleTonExample();
        }
        return singleTonExample;
    }
}
