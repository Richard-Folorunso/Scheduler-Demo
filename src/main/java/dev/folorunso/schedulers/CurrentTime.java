package dev.folorunso.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CurrentTime {

    @Scheduled(fixedRate = 1000)
    public void currentTime() {
        System.out.println("The current time is now [" + new Date() + "]");
    }
}
