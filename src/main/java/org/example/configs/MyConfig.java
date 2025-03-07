package org.example.configs;

import org.example.days.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.example.WeekDay;


import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("org.example.entities")
public class MyConfig {

    @Bean
    public WeekDay weekDay(){
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek){
            case MONDAY : return new Monday();
            case TUESDAY: return  new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }


}
