package com.springexample.springDemo;

public class FortuneService implements IFortuneService{

    @Override
    public String giveFortune() {
       return "This is your lucky day!!";
    }
}
