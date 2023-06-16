package com.springexample.springDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args){
        //load the configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        BaseballCoach theCoach=context.getBean("myCoach",BaseballCoach.class);
        BaseballCoach bbCoach=context.getBean("myCoach",BaseballCoach.class);
        //Call methods  on the bean
        System.out.println(theCoach.giveWorkOut());
        System.out.println(theCoach.giveFortune());
        System.out.println((bbCoach==theCoach));
        System.out.println("BaseballCoach object 1:"+theCoach);
        System.out.println("BaseballCoach object 2:"+bbCoach);

        TennisCoach tennisCoach=context.getBean("tennisCoach",TennisCoach.class);
        TennisCoach tennisCoach2=context.getBean("tennisCoach",TennisCoach.class);
        //Call methods  on the bean
        System.out.println(tennisCoach.giveWorkOut());
        System.out.println(tennisCoach.giveFortune());
        System.out.println(tennisCoach.getEmail());
        System.out.println(tennisCoach.getTeam());
        System.out.println((tennisCoach==tennisCoach2));
        System.out.println("TennisCoach object 1:"+tennisCoach);
        System.out.println("TennisCoach object 2:"+tennisCoach2);


        //close the context
        context.close();
    }
}
