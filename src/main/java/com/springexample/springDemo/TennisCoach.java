package com.springexample.springDemo;

public class TennisCoach implements Coach{

    private FortuneService fortuneService;
    private String email;
    private String team;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    //no-arg constructor
    public TennisCoach(){
        System.out.println("In no-arg constructor!");
    }

    //setter injection

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String giveWorkOut() {
        return "Do 20 squats";
    }

    @Override
    public String giveFortune() {
        return fortuneService.giveFortune();
    }

    public void doMyStartup(){
        System.out.println("In init-method..");
    }

    public void doMyEndStuff(){
        System.out.println("In destroy method..");
    }
}
