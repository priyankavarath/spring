package com.springexample.springDemo;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    //constructor injecting
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String giveWorkOut() {
        return "Run 5km!";
    }

    @Override
    public String giveFortune() {
        return fortuneService.giveFortune();
    }
}
